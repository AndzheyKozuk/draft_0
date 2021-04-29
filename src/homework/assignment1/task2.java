package homework.assignment1;

public class task2 {

    public static void main(String[] args) {

        int a = 1;
        int b = 7;
        int c = 4;
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

}
