//Cameron Mendez
//CSD-402
//Module 2 Assignment
//08-22-2025

//


import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    //Main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //Generate random number between 1 and 3
        int computerChoice = rand.nextInt(3) + 1;

        //Prompt user choice
        System.out.println("Welcome to Rock-Paper-Scissors");
        System.out.println("Enter your choice (1 = Rock, 2 = Paper, 3 = Scissors): ");
        int userChoice = input.nextInt();

        //Display choices
        System.out.println("Player chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        //Determine and display result
        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);

        input.close();
    }

    //Converts numeric choice to string
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid Choice";
        }
    }

    //Determines winner
    public static String determineWinner(int user, int computer) {
        if (user == computer) {
            return "It's a Tie!";
        } 
        else if ((user == 1 && computer == 3) || 
                 (user == 2 && computer == 1) || 
                 (user == 3 && computer == 2)) {
            return "You Win!";
        } 
        else {
            return "Computer Wins!!!";
        }
    }
}
