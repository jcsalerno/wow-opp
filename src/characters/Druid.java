package characters;

public class Druid extends Character{

    private String form = "normal";

    public void shapeshift(String form) {
        this.form = form;
    }

    public Druid(String name, int level) {
        super(name, level);
    }


    @Override
    public String attack() {
        return switch (form) {
            case "felina" -> name + " ataca com garras em forma felina!";
            case "urso" -> name + " esmaga o inimigo em forma de urso!";
            default -> name + " lança feitiços da natureza.";
        };
    }
}
