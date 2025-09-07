//Cameron Mendez
//08/30/2025
//Module-4 Assignment

//Program to demonstrate method overloading with arrays of different data types

public class AverageCalculator {

    //Short array
    public static short average(short[] array) {
        int sum = 0; //use int to avoid overflow during calculation
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length); //cast back to short
    }

    //Int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    //Long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    //Double array
    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    //Test the overloaded methods
    public static void main(String[] args) {

        //Create arrays (different sizes and types)
        short[] shortArray = {2, 4, 6}; 
        int[] intArray = {10, 20, 30, 40}; 
        long[] longArray = {100L, 200L, 300L, 400L, 500L}; 
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5}; 

        //Display arrays and averages
        System.out.println("Short Array: ");
        displayArray(shortArray);
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        System.out.println("Int Array: ");
        displayArray(intArray);
        System.out.println("Average: " + average(intArray));
        System.out.println();

        System.out.println("Long Array: ");
        displayArray(longArray);
        System.out.println("Average: " + average(longArray));
        System.out.println();

        System.out.println("Double Array: ");
        displayArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    //Overloaded methods to display arrays of different types
    public static void displayArray(short[] array) {
        for (short num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayArray(long[] array) {
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
