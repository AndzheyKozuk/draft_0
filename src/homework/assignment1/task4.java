package homework.assignment1;

public class task4 {

    public static void main(String[] args) {

        double a = 1;
        double b = 1.5;

        if ( (a-b)/a <= 0.05 && a > b ) System.out.println("The distance is within 10% accuracy");
        if ( (b-a)/a < 0.05 && b > a ) System.out.println("The distance is within 10% accuracy");
        if ( (a-b)/a > 0.05 && a > b ) System.out.println("The distance is larger than 10% accuracy");
        if ( (b-a)/a >= 0.05 && b > a ) System.out.println("The distance is larger than 10% accuracy");

    }

}
