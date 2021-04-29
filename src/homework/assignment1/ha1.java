package homework.assignment1;

public class ha1 {

    public static void main(String[] args) {



    }

// Task 1
    private static void showDay( int d ) {
        int a = d-1;
        String[] week = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        if( a>0 && a<8 ) {
            System.out.println(week[a]);
        }else{
            System.out.println("There is no such day of week");
        }
    }

// Task 2
    private static void showInterval( int a, int b, int c){
        int L = c - a;
        int R = c - b;
        if ( L < 0 && R < 0 ) System.out.println("Left");
        if ( L > 0 && R < 0 ) System.out.println("Center");
        if ( L < 0 && R > 0 ) System.out.println("Center");
        if ( L > 0 && R > 0 ) System.out.println("Right");
        if ( a < b && c == a ) System.out.println("Center");
        if ( a < b && c == b ) System.out.println("Right");
        if ( a > b && c == a ) System.out.println("Right");
        if ( a > b && c == b ) System.out.println("Center");
}

// Task 3
    private static void showMinMaxMean( double a, double b, double c){
        if ( a < b && a < c ) System.out.println("Min = " + a);
        if ( b < a && b < c ) System.out.println("Min = " + b);
        if ( c < a && c < b ) System.out.println("Min = " + c);
        if ( a > b && a > c) System.out.println("Max = " + a);
        if ( b > a && b > c) System.out.println("Max = " + b);
        if ( c > a && c > b) System.out.println("Max = " + c);
        double mean = (a+b+c)/3;
        System.out.println("Mean = " + mean);
    }

// Task 4
    private static void showDist( double a, double b){
        if ( (a-b)/a <= 0.05 && a > b ) System.out.println("The distance is within 10% accuracy");
        if ( (b-a)/a < 0.05 && b > a ) System.out.println("The distance is within 10% accuracy");
        if ( (a-b)/a > 0.05 && a > b ) System.out.println("The distance is larger than 10% accuracy");
        if ( (b-a)/a >= 0.05 && b > a ) System.out.println("The distance is larger than 10% accuracy");
    }
}
