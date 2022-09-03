package lesson.lesson5.task;

public abstract class Electric implements Soundable{
    private SocketType socketType;

    public Electric(SocketType socketType) {
        this.socketType = socketType;
    }

    public SocketType getSocketType() {
        return socketType;
    }
}
