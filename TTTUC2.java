import java.util.Random;

public class TTTUC2 {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    /**
     * Uses random logic to decide first player and assign symbols
     */
    static void tossAndAssignSymbols() {
        Random rand = new Random();

        // Generate 0 or 1
        int toss = rand.nextInt(2);

        if (toss == 0) {
            // Human starts
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            // Computer starts
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * Displays toss result and symbol assignment
     */
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human won the toss!");
            System.out.println("Human plays first.");
        } else {
            System.out.println("Computer won the toss!");
            System.out.println("Computer plays first.");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}