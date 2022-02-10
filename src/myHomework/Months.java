package myHomework;

public enum Months {
    JANUARY("January", 1),
    FEBRUARY("February", 2),
    MARCH("March", 3),
    APRIL("April", 4),
    MAY("May", 5),
    JUNE("June", 6),
    JULY("July", 7),
    AUGUST("August", 8),
    SEPTEMBER("September", 9),
    OKTOBER("October", 10),
    NOVEMBER("November", 11),
    DECEMBER("December", 12)

    ;
    private final String name;
    private final int num;

        Months(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public static Integer getNumByName(String name) {
        for (Months value : values()) {
            if (value.name.equals(name)) {
                return value.num;
            }
        }
        return null;
    }

    public static String getNameByNum(int num) {
        for (Months value : values()) {
            if (value.num == num) {
                return value.name;
            }
        }
        return null;

    }
}
