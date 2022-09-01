package lesson.lesson5;

public class lesson5 {
    public static void main(String[] args) {
        //полиморфизм
        Boat boat  = new Boat();
        Fish fish  = new Fish();

        boat.swim();
        fish.swim();

        Swimable boat2 = new Boat();
        Swimable fish2 = new Fish();

        boat2.swim();

        Swimable[] swimables = {boat2, fish2};
        for (Swimable swimable : swimables) {
            swimable.swim();
        }

        Boat boat3 = new Boat();
        Fish fish3 = new Fish();

        boat2.swim();

        Swimable[] swimables = {boat3, fish3};
        for (Swimable swimable : swimables) {
            swimable.swim();
            swimable.takeWater();
        }

    }
}
