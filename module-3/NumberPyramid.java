//Cameron Mendez
//CSD-402
//Module 3 Assignment
//08-22-2025

//Provides number pyramid


public class NumberPyramid {

    //Main function
    public static void main(String[] args) {
        int rows = 7; //Total number of rows to print

        //Outer loop
        for (int i = 0; i < rows; i++) {

            //Print leading spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("   "); //3 spaces for formatting
            }

            //Print increasing sequence
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2; //double number each step
            }

            //Print decreasing sequence
            num /= 2; //step back from last doubling
            for (int j = 0; j < i; j++) {
                num /= 2; //halve each time going down
                System.out.print(num + " ");
            }

            //Print the @ symbol at end of each row
            System.out.println("   @");
        }
    }
}
