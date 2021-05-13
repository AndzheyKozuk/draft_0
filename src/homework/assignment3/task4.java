package homework.assignment3;

public class task4 {

    public static void main(String[] args) {

        getCount("  cat car dog   dog     dog    mouse moumouse  mou     moumouse cat    car " );

    }

// Task 4
    private static void getCount(String string) {

        string = string.strip();
        String[] Str = string.split(" ", 0);
        String str = new String();
        int num = 0;
        boolean bool = true;

        if ( Str[0] == "" ) {

            System.out.println("The input is empty.");

        }else{
            for (int i = 0; i < Str.length; i++) {
                // excluding string update cases
                if (bool == false) {
                    bool = true;
                    for (int j = i - 1; j >= 0; j--) {
                        if (Str[i].compareTo(Str[j]) == 0 || Str[i] == "") bool = false;
                    }
                }
                // string str update
                if (bool == true) {
                    num = 0;
                    for (int j = 0; j < Str.length; j++) {
                        if (Str[i].compareTo(Str[j]) == 0) num++;
                    }
                    bool = false;
                    str += Str[i] + ":" + String.valueOf(num) + " ";
                }
            }
            System.out.println(str);
        }
    }

}

