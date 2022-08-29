package lesson.lesson4;

public class lesson4 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        System.out.println(horse.getTeethCount());
        Tiger tiger1 = new Tiger(39, 3);
        Tiger tiger2 = new Tiger(40, 2);
        tiger2.hunt();
        horse.makeSound();
        tiger1.makeSound();
        tiger1.drinkMilk();
    }
}
