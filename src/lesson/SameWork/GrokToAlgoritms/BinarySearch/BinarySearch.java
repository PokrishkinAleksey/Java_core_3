package src.lesson.SameWork.GrokToAlgoritms.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[100];
//        так не работает заполнение!!!!!

//        for (double number: numbers) {
//            number = Math.random()*100;
//            System.out.println(number);
//        }

        for (int i = 0; (i<100); i++) {
            numbers[i] = (int)Math.round(Math.random()*100);
        }

        for (int number: numbers) {
          System.out.print(number+"; ");
        }
        System.out.println();

        //Сортируем (пузырек?)
        int temp;
        for (int j = 0; j < numbers.length-1; j++) {
            for (int i = numbers.length-1; i > 0 ; i--) {
                if (numbers[i]<numbers[i-1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i-1];
                    numbers[i-1] = temp;
               }
            }
        }

        for (int number: numbers) {
            System.out.print(number+"; ");
        }
        int searchCount = (int)Math.round(Math.random()*100);
//        int searchCount = 176;
        System.out.println();
        System.out.println("Ищем число "+searchCount);


        boolean result = false;
        int tempUp = numbers.length;
        int tempDown = 0;
        int temp2;

       // предел вычисления не более log(2^n) -> 30.1... =>31
        for (int i = 0; i < 31; i++) {
            temp2 = (int)(tempUp - tempDown)/2;
            if (temp2 == 0) {
                temp2 = 1;
            }
            temp = tempDown + temp2;
            System.out.println("Итерация: "+ i + " Диапазон [" + tempDown + "]-["+ tempUp + "]Сравниваем " + numbers[temp] + "["+ temp + "] и " + searchCount);
            if (numbers[temp] == searchCount) {
                System.out.println("Значение найдено в " + temp + " ячейке на " + i + " итерации");
                result = true;
                break;
            } else if (numbers[temp] < searchCount) {
                tempDown = temp;
            } else {
                tempUp = temp;
            }
            if (tempDown >= tempUp || temp >= 99 || tempDown+1 == tempUp) {
                System.out.println("Значение не найдено.");
                break;
            }
        }







    }
}
