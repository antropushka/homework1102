package myHomework; // знаю, что не работает, запуталась конкретно

public enum CarColors {
    BLUE("синий"),
    RED("красный"),
    GREEN("зеленый"),
    ORANGE("оранжевый"),
    BLACK("черный"),
    PURPLE("фиолетовый"),
    YELLOW("желтый"),
    GREY("серый"),
    WHITE("белый"),
    ;
    private final String color;


    CarColors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String CompareColor(String color) {
        for (CarColors value : values()) {
            if (value.color.equals(color)) {
                return value.color;
            }
        }
        return null;
    }
}
