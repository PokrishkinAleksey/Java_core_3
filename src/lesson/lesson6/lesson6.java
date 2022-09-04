package lesson.lesson6;

public class lesson6 {
    public static void main(String[] args) {
        //Ошибки
        int x = 2;
        int y = 1;
        int z = 1;

        if  (y != 0) {
            System.out.println(x / y);
        }

        try {
            System.out.println(x / y);
            System.out.println(x / z);
            if (x % 2 == 0) {
                throw new MyTypeException("x - четный. это ошибка");
            }//exception -переменная
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль");
        } catch (MyTypeException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        } catch (Exception exception){
            System.out.println("Иные ошибки");
        }
        finally {
            System.out.println("Это финальное действие");
        }
        System.out.println("Делаем что-то еще");
    }
}
