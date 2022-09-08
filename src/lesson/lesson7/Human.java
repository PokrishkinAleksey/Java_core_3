package lesson.lesson7;

public class Human {
    private String name;
    private int age;
    private int weight;


    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return this.name;
    }
}
