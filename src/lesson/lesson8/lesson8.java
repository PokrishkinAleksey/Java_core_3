package lesson.lesson8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lesson8 {
    public static void main(String[] args) throws IOException {
        //чтения и запись файла
        String path = "C:\\Users\\pokri\\Desktop\\Rep\\java_core_3\\test.txt";
        //FileWriter writer = new FileWriter(path, true);
        FileWriter writer = new FileWriter(path);
        writer.write("Ура наш первый ТХТ\n");
        writer.write("Вторая трока\n");
        writer.close();

       FileReader reader = new FileReader(path);
       if (reader.ready()) {
           int read = reader.read();
           System.out.println(read);
       }
       reader.close();

       BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
       while (bufferedReader.ready()) {
           String s = bufferedReader.readLine();
           System.out.println(s);
       }
        bufferedReader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while (bufferedReader.ready()) {
            String s = bufferedReader.readLine();
            System.out.println(s);
        }
        bufferedReader.close();

        String result = "";
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(path));
        while (bufferedReader2.ready()) {
            result += (char) bufferedReader2.read();
        }
        bufferedReader2.close();

        String firstLine = "Это первая строка";
        String finalResult = firstLine + "\n" + result;
//
//        FileWriter writer2 = new FileWriter(path);
//        writer.write(finalResult);
//        writer.close();


    }
}
