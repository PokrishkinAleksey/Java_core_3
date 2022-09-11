package lesson.lesson7;

public class lesson7 {
    public static void main(String[] args) {
        //класс Object
       Human human = new Human("Alexey");
       Object human2 = new Human("Yuri", 19, 80);

        //получение нав
        System.out.println(human2.toString());
        //получение класса объекта
        System.out.println(human2.getClass());
        //хеш объекта
        System.out.println(human2.hashCode());

        Human petr = new Human("Petr", 19, 80);
        Human ivan = new Human("Ivan", 19, 80);

        //if (petr.getName().equals(ivan.getName())
        //        &&)


    }
}
