//Cameron Mendez
//09/28/2025
//Module-10
//Domestic Division

//subclass of Division representing a domestic division (within the same country)

public class DomesticDivision extends Division {
    //extra field specific to domestic divisions
    private String state;   //state where the division is located

    //constructor requires all fields (including superclass fields)
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        //call the superclass constructor to initialize common fields
        super(divisionName, accountNumber);
        this.state = state;
    }

    //implementation of the abstract display() method
    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("  Division Name: " + divisionName);
        System.out.println("  Account Number: " + accountNumber);
        System.out.println("  State: " + state);
        System.out.println(); // Blank line for readability
    }
}
