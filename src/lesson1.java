import java.util.Arrays;

public class lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //boolean
        boolean b = true;
        boolean b2 = false;

        System.out.println(b);

        //byte = -128...+127
        byte bt = -128;
        byte bt2 = 127;

        //short 2 byte
        short sh = -32768;
        short sh2 = 32767;

        //int 3 byte 32 bit
        int integer = -2_100_000_000;
        int integer2 = 2_100_000_000;

        //long
        long lon = 3_000_000_000_000_000_000L;

        //числа с плавоющей точкой
        //float 32 bit
        //double 64 bit
        float floa = 3.1234567890f;
        double doub = 3.1234567890123456;

        System.out.println(floa);
        System.out.println(doub);

        int x = 4;
        int y = 2;
        int c = x + y;
        int c2 = x -y;
        int c3 = x * y;
        int c4 = x / y;
        int c5 = x % y;

        System.out.println(c);

        //char символы
        char ch = 'l';
        char ch2 = 123;

        System.out.println(ch2);

        char[] answer2 = new char[6];
        answer2[0] = 'М';
        answer2[1] = 'О';
        answer2[2] = 'Т';
        answer2[3] = 'ы';
        answer2[4] = 'Г';
        answer2[5] = 'а';

        System.out.print(answer2);

        char[] anwer3 = {'F', 'B'};
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String word1 = "Hello ";
        String word2 = "world!";
        String result = word1 + word2;
        System.out.println(result);
        System.out.println(word1 + word2);

        String stingFromCharArray = String.valueOf(answer2);
        System.out.println(word1.toUpperCase());
        System.out.println(word1.toLowerCase());
        System.out.println(word1.length());
        String newWord = word1.replaceAll("llo","licopter");
        System.out.println(newWord);

        System.out.println(newWord.repeat(10));


        String word3 = "       world! ++++          ";
        System.out.println(word3.trim());

        //Проверка сохранения версий
        System.out.println(word3.trim());

        System.out.println(b2);
        System.out.println(bt2);
        System.out.println(bt2);
    }
}
