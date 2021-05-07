package homework.assignment2;

import java.util.Scanner;
import java.util.Random;

public class task1 {

    public static void main(String[] args) {

        int size = 5;
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

}
