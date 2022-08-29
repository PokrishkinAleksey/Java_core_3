package lesson.lesson4;

public class Horse extends Animal {
    public  Horse() {
        super(24);
    }
    @Override
    public void makeSound() {
        System.out.println("Лошадь ржот");
    }
}
