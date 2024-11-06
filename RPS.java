
import java.util.Random;
import java.util.Scanner;

public class RPS{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Rock(r) Paper(p) Scissors(s)!");
        int isAgain = 0;
        
        do {
            System.out.println("\n");
            String userChoice = getUserChoice(sc);
        									String computerChoice = getComputerChoice();
        
            System.out.println("\tYou chose: " + userChoice);
            System.out.println("\tComputer chose -> " + computerChoice);
        
            String result = determineWinner(userChoice, computerChoice);
            System.out.println("\tWinner -> " + result);
            
            System.out.print("Enter 1 for play again, 0 for exit: ");
            isAgain = sc.nextInt();
            
        } while (isAgain == 1);
        
        sc.close();
    }

    // Method to get the user's choice
    private static String getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String choice = scanner.nextLine().toLowerCase();
        
        while (!isValidChoice(choice)) {
            System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
            choice = scanner.nextLine().toLowerCase();
        }
        
        return choice;
    }

    // Method to validate the user choice
    private static boolean isValidChoice(String choice) {
        return choice.equals("r") || choice.equals("p") || choice.equals("s");
    }

    // Method to get the computer's choice
    private static String getComputerChoice() {
        String[] choices = {"r", "p", "s"};
        Random random = new Random();
        int index = random.nextInt(choices.length);
        return choices[index];
    }

    // Method to determine the winner
    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "draw";
        }
        
        switch (userChoice) {
            case "r":
                return (computerChoice.equals("s")) ? "user" : "computer";
            case "p":
                return (computerChoice.equals("r")) ? "user" : "computer";
            default:
                return (computerChoice.equals("p")) ? "user" : "computer";
        }
    }
}
