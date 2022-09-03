package lesson.lesson5;

public enum Country {
    RUSSIA(145), USA(330), JAPAN(180);

    private final int countPeople;

    Country(int countPeople) {
        this.countPeople = countPeople;
    }

    public void consoleName() {
        System.out.println(this.name());
    }

    public int getCountPeople() {
        return countPeople;
    }
}
