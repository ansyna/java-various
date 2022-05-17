import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class RockPaperScissors{

    public static void main(String []args){
        playGame();
    }

        /**
     * 
     * @return int
     */
    public static void playGame() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("\nLet's play Rock Paper Scissors.\n>Choose: rock, paper, or scissors.");
            
            String userInput = scan.nextLine();
            String[] values = new String[] {"paper", "scissors", "rock"};
            while (!Arrays.asList(values).contains(userInput)) {
                System.out.println("Please enter rock, paper, or scissors");
                userInput = scan.nextLine();
            }
            String computerGeneratedOption = convertComputerNumToText(generateRandomOption());
            System.out.println("Computer plays " + computerGeneratedOption);

            switch (checkIfWon(userInput, computerGeneratedOption)) {
                case 1:
                    System.out.print("You won");
                    break;
                case 0: 
                    System.out.print("You loose");
                    break;
                case 2:
                    System.out.print("It's a draw");
                    break;
            }
        }
    }

    /**
     * 
     * @return int
     */
    public static int generateRandomOption() {
        double randNumber = Math.random() * 3;
        int randNumberInt = (int)randNumber + 1;

        return randNumberInt;
    }

    public static int checkIfWon(String userInput, String computerGeneratedOption) {
        int result = 0;
        // TO DO rewrite with Arrays
        switch (userInput) {
            case "rock":
                if (computerGeneratedOption == "scissors") {
                    result = 1;
                } else if (computerGeneratedOption == "paper") {
                    result = 0;
                } else {
                    result = 2;
                }
                break;
            case "scissors":
                if (computerGeneratedOption == "paper") {
                    result = 1;
                } else if (computerGeneratedOption == "rock") {
                    result = 0;
                } else {
                    result = 2;
                }
                break;
            case "paper":
                if (computerGeneratedOption == "rock") {
                    result = 1;
                } else if (computerGeneratedOption == "scissors") {
                    result = 0;
                } else {
                    result = 2;
                }
                break;
        }

        return result;
    }
    
    public static String convertComputerNumToText(int computerGeneratedOption) {
        switch (computerGeneratedOption) {
            case 1:
                return "rock";
            case 2: 
                return "scissors";
            case 3:
                return "paper";
            default:
                return null;
        }
    }
}