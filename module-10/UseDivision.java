//Cameron Mendez
//09/28/2025
//Module-10
//Use Division

//main application class to demonstrate use of Division, InternationalDivision, DomesticDivision

public class UseDivision {
    public static void main(String[] args) {
        //create two InternationalDivision objects
        InternationalDivision intlDiv1 = new InternationalDivision("Europe Sales", 101, "Germany", "German");
        InternationalDivision intlDiv2 = new InternationalDivision("Asia Operations", 102, "Japan", "Japanese");

        //create two DomesticDivision objects
        DomesticDivision domDiv1 = new DomesticDivision("East Coast Marketing", 201, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Support", 202, "California");

        //display details of each division
        intlDiv1.display();
        intlDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
