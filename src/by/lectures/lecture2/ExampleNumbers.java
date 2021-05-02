package by.lectures.lecture2;

public class ExampleNumbers {

    public static void main(String[] args) {
    }

    private static void showChar() {
        char charVar = 'a';
        System.out.println(charVar);

        charVar = '\'';
        System.out.println(charVar);
    }

    private static void showBoolean() {
        boolean booleanVar = true;
        System.out.println(booleanVar);
    }

    private static void showFloatAndDouble() {
        double doubleVar = 45.653;
        System.out.println("doubleVar = " + doubleVar);

        float floatVar = 342.56F;
        System.out.println("floatVar = " + floatVar);

        int intVar = 17;
        double newVar = intVar;
        System.out.println("newVar = " + newVar); // may be 17.0000000001
    }

    private static void showNarrowingCast() {
        int intVar = 17;

//        byte byteVar = intVar; // not allowed

        byte byteVar = (byte) intVar;

        System.out.println("byteVar = " + byteVar);

        // byte: -128 .. 127
        intVar = 128;
        byteVar = (byte) intVar;
        System.out.println("byteVar = " + byteVar);

        intVar = 78654345;
        byteVar = (byte) intVar;
        System.out.println("byteVar = " + byteVar);
    }

    private static void showWideningCast() {
        byte byteVar = 17;
//        int intVar = (int) byteVar; // allowed
        int intVar = byteVar;
        System.out.println("intVar = " + intVar);
    }

    // byte, short, int, long
    private static void showPrimitiveInit() {

        byte byteVar;
        byteVar = 34;
//        byteVar = 24535364; // not allowed
        System.out.println("byteVar = " + byteVar);

        byte ByteVar; // another variable

        short shortVar = -5654;
//        shortVar = 78654635; // not allowed
        System.out.println("shortVar = " + shortVar);

        int intVar = 543345334;
        System.out.println("intVar = " + intVar);

        long longVar = 87654334345334L;
        System.out.println("longVar = " + longVar);

    }

}
