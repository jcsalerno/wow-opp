package characters;

public abstract class Character {

    protected  String name;
    protected int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public abstract String attack();
}
