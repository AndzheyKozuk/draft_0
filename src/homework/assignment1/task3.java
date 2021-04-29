package homework.assignment1;

public class task3 {

    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double c = 3;
        double mean = (a+b+c)/3;

        if ( a < b && a < c ) System.out.println("Min = " + a);
        if ( b < a && b < c ) System.out.println("Min = " + b);
        if ( c < a && c < b ) System.out.println("Min = " + c);
        if ( a > b && a > c) System.out.println("Max = " + a);
        if ( b > a && b > c) System.out.println("Max = " + b);
        if ( c > a && c > b) System.out.println("Max = " + c);
        System.out.println("Mean = " + mean);

    }

}
