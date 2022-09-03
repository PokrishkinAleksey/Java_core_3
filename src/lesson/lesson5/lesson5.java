package lesson.lesson5;

public class lesson5 {
    public static void main(String[] args) {
        //полиморфизм
        System.out.println("пример 1");
        Boat boat  = new Boat();
        Fish fish  = new Fish();

        boat.swim();
        fish.swim();

        System.out.println("пример 2");
        Swimable boat2 = new Boat();
        Swimable fish2 = new Fish();

        boat2.swim();

        Swimable[] swimables = {boat2, fish2};
        for (Swimable swimable : swimables) {
            swimable.swim();
        }

        System.out.println("пример 3");
        Tiger tiger = new Tiger();
        Boat boat3 = new Boat();
        Fish fish3 = new Fish();
        Swimable[] swimables2 = {boat3, fish3, tiger};
        for (Swimable swimable : swimables2) {
            swimable.swim();
            swimable.takeWater();
        }

        tiger.eat();
        tiger.move();

        Animal tiger2 = new Tiger();
        Animal cat = new Cat();

        Country country1 = Country.RUSSIA;
        EnumCountry country2 = EnumCountry.RUSSIA;
        country1.getCountPeople();
        country2.getCountPeople();

    }
}
