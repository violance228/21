package sample;

public enum Enums {
    ACE(1, "Туз", 1, new Color()),
    TWO(2, "Два", 2, new Color()),
    THREE(3, "Три", 3, new Color()),
    FOUR(4, "Чотири", 4, new Color()),
    FIVE(5, "Пять", 5, new Color()),
    SIX(6, "Шість" , 6, new Color()),
    SEVEN(7, "Сім", 7, new Color()),
    EIGHT(8, "Вісім", 8, new Color()),
    NINE(9, "Девять", 9, new Color()),
    TEN(10, "Десять", 10, new Color()),
    JACK(11, "Валет", 2, new Color()),
    LADY(12, "Дама", 3, new Color()),
    KING(13, "Король", 4, new Color());

    private Integer position;
    private Integer point;
    private String name;
    private Color color;

    Enums(int position, String name,Integer point, Color color) {
        this.position = position;
        this.name = name;
        this.point = point;
        this.color = color;
    }

    public Integer getPosition() {
        return position;
    }

    public Integer getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public static Enums getEnumByPosition(Integer position) {
        for (Enums enums : values()) {
            if (enums.position == position) {
                return enums;
            }
        }
        return null;
    }
}
