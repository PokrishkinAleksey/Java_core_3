package lesson.lesson4;

public class Tiger extends Mammal {
    public Tiger(int count, int countMilk) {
        super(count, countMilk);
    }

    public void hunt() {
        System.out.println("Тигр охотится");
    }
    @Override
    public void makeSound() {
        System.out.println("Тигра рычит");
    }

}
