//Cameron Mendez
//09/28/2025
//Module-10
//Division


//abstract class Division
//this class cannot be instantiated directly because it is abstract.
//it defines common fields and behavior for all divisions of a company.

public abstract class Division {
    //common fields for all divisions
    protected String divisionName;   //name of the division
    protected int accountNumber;     //account number of the division

    //constructor requires values for both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    //abstract method that must be implemented in the subclasses
    //each subclass will provide its own version of display()
    public abstract void display();
}
