package homework.assignment3;

import java.util.Random;
import java.util.regex.Pattern;

public class task2 {

    public static void main(String[] args) {

        String str = getString(1000);
        System.out.println(str);
        str = changeString(str);
        System.out.println(str);

    }

    // Task 1
    private static String getString(int size) {
        Random random = new Random();
        int[] array = new int[size+1];
        String str = "";

        for (int i = 0; i < size+1; i++) {

            int var = random.nextInt(1001);
            str = String.join(" ", str, String.valueOf(var));
            /* alternatively - str += String.valueOf(var) + " "; */

        }
        return str;
    }

    // Task 2
    private static String changeString(String string) {
        String reg = "\s[0123456789][0123456789]\s";
        Pattern pattern = Pattern.compile(reg);
        String str;
        str = string.replaceAll( reg, " " + String.valueOf(-1) + " ");
        return str;
    }

}

