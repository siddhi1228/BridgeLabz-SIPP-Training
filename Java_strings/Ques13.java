package Java_strings;

import java.util.*;

public class Ques13 {

    private static final String[] MOVES = {"rock", "paper", "scissors"};
    private static final Random RND = new Random();

    static String computerMove() {
        return MOVES[RND.nextInt(3)];
    }

    static int outcome(String user, String comp) {
        if (user.equals(comp)) return 0;          // draw
        if (user.equals("rock")     && comp.equals("scissors") ||
            user.equals("paper")    && comp.equals("rock") ||
            user.equals("scissors") && comp.equals("paper"))   return 1; // user win
        return -1;                                // comp win
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of games: ");
        int games = sc.nextInt(); sc.nextLine();

        int userWins = 0, compWins = 0, draws = 0;

        System.out.printf("%-6s %-10s %-10s %-6s%n", "Game", "Player", "Computer", "Result");
        for (int g = 1; g <= games; g++) {
            System.out.print("Your move (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String comp = computerMove();
            int res = outcome(user, comp);

            String result;
            if (res == 1)      { result = "Player"; userWins++; }
            else if (res == -1){ result = "Computer"; compWins++; }
            else               { result = "Draw"; draws++; }

            System.out.printf("%-6d %-10s %-10s %-6s%n", g, user, comp, result);
        }

        System.out.println("\n=== Stats ===");
        System.out.printf("Player wins  : %d (%.2f%%)%n", userWins , 100.0 * userWins / games);
        System.out.printf("Computer wins: %d (%.2f%%)%n", compWins , 100.0 * compWins / games);
        System.out.printf("Draws        : %d (%.2f%%)%n", draws    , 100.0 * draws    / games);
        sc.close();
    }
}

