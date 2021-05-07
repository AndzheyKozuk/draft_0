package homework.assignment2;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

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

}
