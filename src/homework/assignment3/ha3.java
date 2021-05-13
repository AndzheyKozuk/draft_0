package homework.assignment3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ha3 {

    public static void main(String[] args) {

        //String str = getString(1000);
        //System.out.println(str);
        //str = changeString(str);
        //System.out.println(str);
        showInvite();
        //getCount("  cat car dog   dog     dog    mouse moumouse  mou     moumouse cat    car " );

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

// Task 3
    private static void showInvite() {

        LocalDate date = LocalDate.now();
        LocalTime localtime = LocalTime.now();
        StringBuffer time = new StringBuffer(localtime.toString());
        time.delete(8,18);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String str =
                String.format("Hello, %s!\n" + "Today is %s." + " Current time is %s.", name, date, time);
        System.out.println(str);

    }

// Task 4
    private static void getCount(String string) {

        string = string.strip();
        String[] Str = string.split(" ", 0);
        String str = new String();
        int num = 0;
        boolean bool = true;

        if ( Str[0] == "" ) {

            System.out.println("The input is empty.");

        }else{
            for (int i = 0; i < Str.length; i++) {
                // excluding string update cases
                if (bool == false) {
                    bool = true;
                    for (int j = i - 1; j >= 0; j--) {
                        if (Str[i].compareTo(Str[j]) == 0 || Str[i] == "") bool = false;
                    }
                }
                // string str update
                if (bool == true) {
                    num = 0;
                    for (int j = 0; j < Str.length; j++) {
                        if (Str[i].compareTo(Str[j]) == 0) num++;
                    }
                    bool = false;
                    str += Str[i] + ":" + String.valueOf(num) + " ";
                }
            }
            System.out.println(str);
        }
    }

}
