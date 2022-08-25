package lesson.lesson2;

import java.sql.SQLOutput;

public class lesson2 {

    public static void main(String[] args) {
        //логические операторы
        int number1 = 0;
        int number2 = 9;

        if (number1 == number2) {
            System.out.println("Ура, числа равны!");
        }

        boolean result = number1 == number2;
        //result = false

        if (result) {
            System.out.println("Ура, числа до сих пор равны!");
        }

        if (number1 == number2) {
            System.out.println("Ура, числа равны!");
        } else {
            System.out.println("Ура, числа не равны!");
        }

        if (number1 >0) {
            System.out.println("Число положительное");
        } else if (number1 == 0){
            System.out.println("Число равно 0");
        } else {
            System.out.println("Число отрицательное");
        }

        int number3 = 3;
        String name = new String ("Yuri");
        String name2 = new String ("Yuri");

        //так не может сравнивать стрини
        if (name == name2) {
            System.out.println("Имена равны");
        }  else {
            System.out.println("Имена не равны");
        }

        if (name.equals(name2)) {
            System.out.println("Имена равны");
        }  else {
            System.out.println("Имена не равны");
        }
        //Булева логика
        //&& логическое "и" || или
        //примиер из реальной жизни: купи хлеб и молоко

        boolean isMilkBought = true;
        boolean isBreadBought = false;

        //купил хлеб и молоко - выполнил
        boolean result2 = isMilkBought && isBreadBought;
        //купил только молоко или только хлеб - не выполнил
        boolean result3 = true && false;

        //примиер из реальной жизни: купи хлеб или молоко
        //купил и хлеб и молоко
        boolean result4 = isMilkBought || isBreadBought;
        //купил молоко
        boolean result5 = true || false;
        //купил не купил ничего
        boolean result6 = false || false;

        //логичекое "не"
        //примиер из реальной жизни: кне ходи в тот двор
        boolean sonGoToAnotherHouse = true;
        //если пошел
        boolean result7 = !sonGoToAnotherHouse;
        //не пошел
        boolean result8 = !false;

        //циклы
        String[] cats = new String[4];
        cats[0] = "Барсик";
        cats[1] = "Мурзик";
        cats[2] = "Рыжик";
        cats[3] = "Чапа";

        //for each
        for (String cat: cats) {
            System.out.println(cat + ", иди есть!");
        }
        //
        // for (int i = 0; i < cats.length; i +=1)
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i] + ", иди есть! Номер кота: "+(i + 1));
        }

        for (int i = 3; i >= 0; i -=1) {
            System.out.println(cats[i] + ", иди есть! Номер кота: "+(i + 1));
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(cats[i] + ", иди есть! Номер кота: "+(i + 1));
        }

        int count = 1;
        while (count < 11) {
            System.out.println(count);
            count++;
        }
        int count2 = 1;
        while (count2 < 11) {
            System.out.println(count2);
            if (count2 ==5) {
                break;
            }
            count2++;
        }

        //прерываение итерации
        int count3 = 1;
        while (count3 < 11) {
            if (count3 == 6) {
                count3++;
                continue;
            }
            System.out.println(count3);
            count3++;
        }

        int count4 = 100;
        while (count4 >0) {
            if (count4 % 3 == 0) {
                System.out.println(count4);
            }
            count4--;
        }

        String[] names = {"Yuri","Maksim","Alexey","Petr","Nikodim"};
        for (String nameA : names) {
            if (nameA.equals("Alexey")) {
                System.out.println("Леха");
                continue;
            } else if (nameA.equals("Petr")) {
                break;
            } else {
                System.out.println(nameA);
            }
        }
    }
}
