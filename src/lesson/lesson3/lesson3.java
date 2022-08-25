package lesson.lesson3;

public class lesson3 {
    public static void main(String[] args) {
        int age = 21;
        int weight = 80;
        //Создание экземпляра
        Human human = new Human(21,80,"Yuri");
        Human human2 = new Human(39, 102, "Алексей");
        Human human3 = new Human(3, 5, "Никодим");
        human.getInfo();

        //System.out.println(human.getWeightInPounds());

        System.out.println(human.getAge());
        human.setAge(22);
        System.out.println(Human.count);
        Human.printCount();

        System.out.println(human);
        System.out.println(human2);

        Cat cat1 = new Cat(true);
        Cat cat2 = new Cat(false);

        cat1.sayMeow();
        cat2.sayMeow();

        Plane plane1 = new Plane(100, 0);

        System.out.println(plane1.getCountPeople());
        plane1.fly();

    }
}
