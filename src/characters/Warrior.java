package characters;

public class Warrior extends Character {

    public Warrior (String name, int level) {
        super(name, level);
    }

    @Override
    public String attack() {
        return name + " ataca com o machado";
    }
}
