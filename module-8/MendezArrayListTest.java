//Cameron Mendez
//09/20/2025
//Module-8: MendezArrayListTest

import java.util.ArrayList;
import java.util.Scanner;

public class MendezArrayListTest {

    //method to find maximum value in ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0; //return 0 if list is empty
        }
        int maxValue = list.get(0); //assume first value is max
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            int input = scanner.nextInt();
            numbers.add(input); //add input to the ArrayList
            if (input == 0) {
                break; //stops input when 0 is entered
            }
        }

        //call max method/display result
        Integer largest = max(numbers);
        System.out.println("The largest value entered was: " + largest);

        scanner.close();
    }
}
