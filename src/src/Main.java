
public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("This is the minimum value for an integer: " + myMinIntValue);
        System.out.println("This is the maximum value for an integer: " + myMaxIntValue);
        System.out.println("Busted max value: " + (myMaxIntValue + 1)); // Overflow
        System.out.println("Busted min value: " + (myMinIntValue - 1)); //Underflow

    }
}
