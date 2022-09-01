package lesson.lesson5;

public class Fish implements Swimable, Movable {
    public void swim() {
        System.out.println("Рыба плывет");
    }
    public void move() {
        System.out.println("Рыба движется");
    }
}
