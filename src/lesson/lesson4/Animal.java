package lesson.lesson4;

public abstract class Animal {
    private int  teethCount;

    public Animal(int teethCount) {
        this.teethCount = teethCount;
    }
    public abstract void makeSound();
    public int getTeethCount() {
        return teethCount;
    }
}
