package lesson.lesson5.task;

public class Phone extends  Electric {
    public Phone() {
        super(SocketType.CHINA);
    }

    public void Call() {
        System.out.println("Телефон звонит");
    }

    @Override
    public void sound() {
        System.out.println("Играет рингтон");
    }
}
