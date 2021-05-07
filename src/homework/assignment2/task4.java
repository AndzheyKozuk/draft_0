package homework.assignment2;

import java.util.Random;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        System.out.println("Choose a number to guess from 0 to 100:");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 1;
        boolean exit = false;
        if (number < 0 || number > 100) {
            System.out.println("Incorrect choice.");
        }else {
            while (exit != true) {
                int var = random.nextInt(101);
                if (var == number) {
                    exit = true;
                    System.out.println("Number of guesses was " + count);
                }
                count++;
            }
        }

    }

}
