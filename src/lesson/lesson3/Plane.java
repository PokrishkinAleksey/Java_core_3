package lesson.lesson3;

public class Plane {
    private int countPassangers;
    private int countWorker;


    public Plane(int countPassangers, int countWorker) {
        this.countPassangers = countPassangers;
        this.countWorker = countWorker;
    }
    public int getCountPeople() {
        return countPassangers + countWorker;
    }
    public void fly() {
        if (countWorker>0 && countPassangers>0) {
            System.out.println("Самолет летит");
        } else {
            System.out.println("Самолет не летит");
        }
    }


}
