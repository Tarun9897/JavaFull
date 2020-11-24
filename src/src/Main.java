
public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("This is the minimum value for an integer: " + myMinIntValue);
        System.out.println("This is the maximum value for an integer: " + myMaxIntValue);
        System.out.println("Busted max value: " + (myMaxIntValue + 1)); // Overflow
        System.out.println("Busted min value: " + (myMinIntValue - 1)); //Underflow

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum value: " +myMinByteValue);
        System.out.println("Byte Maximum value: " +myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum value: " +myMinShortValue);
        System.out.println("Short Maximum value: " +myMaxShortValue);
        
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum value: " +myMinLongValue);
        System.out.println("Long Maximum value: " +myMaxLongValue);




    }
}
