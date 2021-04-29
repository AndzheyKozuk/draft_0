package homework.assignment1;

public class task1 {

    public static void main(String[] args) {

        int d = 2;
        int a = d-1;
        String[] week = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        if( a>0 && a<8 ) {
            System.out.println(week[a]);
        }else{
            System.out.println("There is no such day of week");
        }

    }

}
