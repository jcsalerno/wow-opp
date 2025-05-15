import characters.Character;
import characters.Druid;
import characters.Mage;
import characters.Warrior;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class WorldOfWarcraftSystem {
    private static List<Character> characters = new ArrayList<>();
    private static ExecutorService executor = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws Exception {
        // Cadastro de personagens
        characters.add(new Warrior("Garrosh", 60));
        characters.add(new Mage("Jaina", 58));
        Druid druid = new Druid("Malfurion", 70);
        druid.shapeshift("");
        characters.add(druid);

        // Mostrar ataques
        characters.forEach(c -> System.out.println(c.attack()));

        // Simular missões em paralelo
        List<CompletableFuture<String>> missions = characters.stream()
                .map(c -> CompletableFuture.supplyAsync(() -> processMission(c), executor))
                .collect(Collectors.toList());

        // Aguardar todas as missões
        CompletableFuture.allOf(missions.toArray(new CompletableFuture[0])).join();

        // Mostrar resultados
        missions.forEach(f -> {
            try {
                System.out.println(f.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
    }

    private static String processMission(Character character) {
        try {
            Thread.sleep(1000 + new Random().nextInt(2000)); // simula tempo de missão
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return character.getName() + " completou a missão com sucesso!";
    }
}
