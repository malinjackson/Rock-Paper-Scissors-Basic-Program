import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //Continues to prompt user until "exit" is entered.
        while(true){
        System.out.println("What's your move? Rock, Paper, or Scissors? ");
            System.out.println("If You want to exit the game, type exit.");

        //Assigns the input to a string variable.
        String playerMove = scnr.nextLine();
        //Checks to see if "exit" was entered and breaks the loop if it was.
        if(playerMove.equalsIgnoreCase("exit")){
            System.out.println("Goodbye!");
            break;
        }

        //Checks to make sure nothing other than "rock", "paper", or "scissors" was entered.
        if(!playerMove.equalsIgnoreCase("rock")
                && !playerMove.equalsIgnoreCase("paper")
                && !playerMove.equalsIgnoreCase("scissors")){
            System.out.println("You did not enter a valid move!");
        }

        //Uses Math.random to assign a random output of 1, 2, or 3 to rock, paper, or scissors.
        int randMove = (int) Math.random()*3;
        String computerMove = "";
        if(randMove==0){
            computerMove = "Rock";
        }else if(randMove==1){
            computerMove="Paper";

        }else {
            computerMove ="Scissors";
        }
        System.out.println("Your Opponent Chose: " + computerMove);

        //Checks the player's move to the computer's random move to determine if the user tied, won, or lost.
        if(computerMove.equalsIgnoreCase(playerMove)){
            System.out.println("You tied!");
        }else if(computerMove.equalsIgnoreCase("rock")&&playerMove.equalsIgnoreCase("paper")
                || computerMove.equalsIgnoreCase("paper")&&playerMove.equalsIgnoreCase("scissors")
        || computerMove.equalsIgnoreCase("scissors")&&playerMove.equalsIgnoreCase("rock")){
            System.out.println("You won :)");
        }else{
            System.out.println("You lost :(");
        }
    }
    }
}
