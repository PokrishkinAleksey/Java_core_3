package lesson.lesson5;

public class EnumCountry {
    public static final EnumCountry RUSSIA = new EnumCountry("RUSSIA", 145);
    public static final EnumCountry USA = new EnumCountry("USA", 330);
    public static final EnumCountry JAPAN = new EnumCountry("JAPAN", 180);

    private String name;
    private int countPeople;
    public EnumCountry(String name, int countPeople) {
        this.name = name;
        this.countPeople = countPeople;
    }

    public void consoleName() {
        System.out.println(this.name);
    }
    public int getCountPeople() {
        return countPeople;
    }
}
