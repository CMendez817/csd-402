//Cameron Mendez
//09/28/2025
//Module-10
//International Division

//subclass of Division representing an international division

public class InternationalDivision extends Division {
    //extra fields specific to international divisions
    private String country;   //country where division is located
    private String language;  //primary language spoken in the division

    //constructor requires all fields (including superclass fields)
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        //call the superclass constructor to initialize common fields
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    //implementation of the abstract display() method
    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("  Division Name: " + divisionName);
        System.out.println("  Account Number: " + accountNumber);
        System.out.println("  Country: " + country);
        System.out.println("  Language: " + language);
        System.out.println(); // Blank line for readability
    }
}
