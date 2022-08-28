package lesson.lesson3;

public class Human {

    static int count = 0;
    int age;
    private int weight;
    String name;

    public Human(int humanAge, int humanWeight, String humanName) {
        count += 1;
        this.name = humanName;
        this.age = humanAge;
        this.weight = humanWeight;
    }
    public void getInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.weight);
    }

    //геттер - выдает параметр
    public int getAge() {
        return age - 1;
        //return age - 12;
        //return age * 3;
    }

    //сеттер - устанавливает параметр
    public  void setAge(int newHumanAge) {
        if (newHumanAge > 21) {
            System.out.println("невозможно");
        } else {
            this.age = newHumanAge;
        }
    }
    public static void printCount() {
        System.out.println(count);
    }


    public int getWeightInPounds() {
        return weight * 2;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", weigh=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

}
