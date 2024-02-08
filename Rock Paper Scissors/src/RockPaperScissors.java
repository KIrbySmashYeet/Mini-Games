import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rock Paper Scissors!");
        System.out.println("Type 'R' for Rock, 'P' for Paper, and 'S' for Scissors\n");

        while(true) {
            System.out.print("Player 1: ");
            String player1 = scanner.nextLine();

            System.out.print("Player 2: ");
            String player2 = scanner.nextLine();

            System.out.println();
            displayWinner(gameLogic(player1, player2));


            System.out.println("\n Do you want to play another round? (Enter to continue, 'No' to stop)");
            String continueOrNo = scanner.nextLine();

            if (continueOrNo.equalsIgnoreCase("No")) break;
        }

    }

    public static int gameLogic(String player1, String player2) {
        if (player1.equalsIgnoreCase("R")) {
            if (player2.equals("R")) {
                return 0; // Tie
            } else if (player2.equals("S")) {
                return 1; // Player 1 wins
            } else if (player2.equals("P")) {
                return 2; // Player 2 wins
            }
        } else if (player1.equalsIgnoreCase("S")) {
            if (player2.equals("R")) {
                return 2; // Player 2 wins
            } else if (player2.equals("S")) {
                return 0; // Tie
            } else if (player2.equals("P")) {
                return 1; // Player 1 wins
            }
        } else if (player1.equalsIgnoreCase("P")) {
            if (player2.equals("R")) {
                return 1; // Player 1 wins
            } else if (player2.equals("S")) {
                return 2; // Player 2 wins
            } else if (player2.equals("P")) {
                return 0; // Tie
            }
        }
        return -1; // Invalid input
    }

    public static void displayWinner(int winnerNum) {
        if (winnerNum == 0) {
            System.out.println("It's a Tie!!");

        } else if (winnerNum == 1) {
            System.out.println("Player 1 Wins!!");

        } else if (winnerNum == 2) {
            System.out.println("Player 2 Wins!!");

        } else if (winnerNum == -1) {
            System.out.println("Invalid Moves.");
        }
    }
}