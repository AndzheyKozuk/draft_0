package homework.assignment2;

import java.util.Scanner;


public class task2 {

    public static void main(String[] args) {

        int[] year_2020 = new int[] { 32, 30, 32, 31, 32, 31, 32, 32, 31, 32, 31, 32};

        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();

        if ( month > 0 && month < 13) {

            if (day > 0 && day < year_2020[month-1])
                System.out.println(day + "." + month + " is a date of 2020 year.");

        }
        System.out.println(day + "." + month + " do not correspond to a date of 2020 year.");

    }

}
