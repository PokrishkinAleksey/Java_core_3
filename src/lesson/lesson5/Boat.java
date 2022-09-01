package lesson.lesson5;

public class Boat  implements Swimable, Movable {
    public void swim() {
        System.out.println("Лодка плывет");
    }

    public void crush() {
        System.out.println("Лодка тонет");
    }
    public void move() {
        System.out.println("Лодка движется");
    }
}
