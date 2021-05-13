package homework.assignment3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        showInvite();


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

}

