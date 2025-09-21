//Cameron Mendez
//09/20/2025
//Module-9_1


import java.util.ArrayList;
import java.util.Scanner;

public class Mendez_Module_9_1 {

    public static void main(String[] args) {
        //ArrayList with 10 colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("1. Red");
        colors.add("2. Blue");
        colors.add("3. Green");
        colors.add("4. Yellow");
        colors.add("5. Orange");
        colors.add("6. Purple");
        colors.add("7. Pink");
        colors.add("8. Brown");
        colors.add("9. Black");
        colors.add("10. White");

        //print ArrayList using for-each loop
        System.out.println("ArrayList of colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0-9) of the color you want to see again: ");

        try {
            int index = Integer.parseInt(scanner.nextLine()); //Autoboxing/Auto-Unboxing
            System.out.println("Color at index " + index + " is: " + colors.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter an integer.");
        }

        scanner.close();
    }
}
