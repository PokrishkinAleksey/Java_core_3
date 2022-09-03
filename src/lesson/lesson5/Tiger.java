package lesson.lesson5;

public class Tiger extends Animal implements Swimable, Movable, Eatable {
    @Override
    public void swim() {
        System.out.println("Тигр плывет");
    }

    @Override
    public void takeWater() {
        System.out.println("Тигр не берет воду, у тигра лапки");
    }

    @Override
    public void eat() {
        System.out.println("Тигр ест мясо");
    }

    @Override
    public void move() {
        System.out.println("Тигр движется");
    }
}
