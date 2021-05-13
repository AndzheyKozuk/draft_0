package homework.assignment3;

import java.util.Random;


public class task1 {

    public static void main(String[] args) {

        //String str = getString(1000);

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


}

