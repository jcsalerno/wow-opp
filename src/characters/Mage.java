package characters;

public class Mage extends Character{

    public Mage(String name, int level) {
        super(name, level);
    }

    @Override
    public String attack() {
        return name + " lança uma bola de gelo! ";
    }
}
