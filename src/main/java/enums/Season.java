package enums;

public enum Season {
    WINTER("Холодно"),
    SPRING("Тепло"),
    SUMMER("Hot"),
    AUTUMN("Прохладно");

    private String description;
    Season(String description){
        this.description =description;
    }

    public String getDescription(){
        return description;
    }
}
