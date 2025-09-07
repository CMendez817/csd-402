//Cameron Mendez
//09/06/2025
//Module-6


//Fan class with test code
public class Fan {

    //Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    //Private fields
    private int speed;       //default STOPPED
    private boolean on;      //true = fan on, false = off
    private double radius;   //default = 6
    private String color;    //default = "white"

    //No argument constructor sets default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    //Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //Getter and Setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString method returns description Fan state
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON [Speed: " + speed + ", Radius: " + radius + ", Color: " + color + "]";
        } else {
            return "Fan is OFF [Radius: " + radius + ", Color: " + color + "]";
        }
    }

    //Test program
    public static void main(String[] args) {
        //Create fan using default constructor
        Fan defaultFan = new Fan();

        //Create fan using argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10, "blue");

        //Display states of both fans
        System.out.println("Default Fan: " + defaultFan.toString());
        System.out.println("Custom Fan: " + customFan.toString());

        //Demonstrate modifying fan properties
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setRadius(8);
        defaultFan.setColor("black");

        System.out.println("\nModified Default Fan: " + defaultFan.toString());

        //Turn off custom fan
        customFan.setOn(false);
        System.out.println("Modified Custom Fan: " + customFan.toString());
    }
}
