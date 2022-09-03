package lesson.lesson5.task;

public class Microwave extends  Electric{
    public Microwave() {
        super(SocketType.EURO);
    }

    public void Cooking() {
        System.out.println("Разогревает еду");
    }

    @Override
    public void sound() {
        System.out.println("Микроволновка пикает");
    }
}
