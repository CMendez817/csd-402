//Cameron Mendez
//09/14/2025
//Module-7
//UseFans

import java.util.ArrayList;

public class UseFans {

    //method to display a single Fan without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan State:");
        System.out.println("  On: " + (fan.isOn() ? "Yes" : "No"));
        System.out.println("  Speed: " + fan.getSpeed());
        System.out.println("  Radius: " + fan.getRadius());
        System.out.println("  Color: " + fan.getColor());
        System.out.println("------------------------");
    }

    //method to display a collection of Fans
    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan f : fans) {
            displayFan(f);
        }
    }

    public static void main(String[] args) {
        //create a collection of Fan objects
        ArrayList<Fan> fanList = new ArrayList<>();

        Fan fan1 = new Fan(); // default fan
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8, "black");
        Fan fan4 = new Fan(Fan.SLOW, false, 12, "silver");

        //add fans to the list
        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);
        fanList.add(fan4);

        //display all fans in the collection
        System.out.println("Displaying all fans in collection:\n");
        displayFans(fanList);

        //display one fan individually
        System.out.println("Displaying a single fan:\n");
        displayFan(fan2);
    }
}
