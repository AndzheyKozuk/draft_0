package homework.assignment2;

import java.util.Scanner;
import java.util.Random;

public class ha2 {

    public static void main(String[] args) {



    }

    // Task 1
    private static void showPyramid(int size) {

        int[][] pyramid = new int[size][size];

        for (int i = 0; i < (size+1)/2; i++){
            for (int j = 0; j < size-2*i; j++){
                pyramid[i+j][i]=i+1;
                pyramid[i][i+j]=i+1;
                pyramid[size -1-i-j][size -1-i]=i+1;
                pyramid[size -1-i][size -1-i-j]=i+1;
            }
        }

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(pyramid[i][j] + "  ");
            }
            System.out.print("\n");
        }

    }

    // Task 2
    private static void showDate() {

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

    // Task 3
    private static void showQuestion() {

        System.out.println("\nWhat is the density of water in 1 atm at 3.98 °C?\n");
        System.out.println("1. 1000 kg/m^3 " + " 2. 997 kg/m^3 \n");
        System.out.println("3. 917 kg/m^3 " + " 4. 1010 kg/m^3 \n");

        System.out.println("Choose: ");
        System.out.println("1. answer question " + " 2. give up ");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();

        if (ch == 1){
            boolean exit = false;
            while (exit != true) {
                System.out.println("Enter your answer: ");
                int answer = scanner.nextInt();

                if (answer == 1) System.out.println("Wrong answer, 1000 kg/m^3 is normal water density.\n");
                if (answer == 2) { System.out.println("Right answer."); exit = true;}
                if (answer == 3) System.out.println("Wrong answer.The density of ice is 917 kg/m3.\n");
                if (answer == 4) System.out.println("Wrong answer.\n");

                if (answer < 1 || answer > 4) {
                    System.out.println("Incorrect choice.\n");
                }
            }
        }
        if (ch == 2){
            System.out.println("You choose to give up.");
        }
        if (ch < 1 || ch > 2) {
            System.out.println("Incorrect choice.");
        }

    }

    // Task 4
    private static void showGuess() {

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
