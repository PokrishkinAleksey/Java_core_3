package lesson.lesson5;

public interface Swimable {
    int count = 10;
    void swim();

    default void takeWater() {
        System.out.println("Берет воду: " + count);
    }

}
