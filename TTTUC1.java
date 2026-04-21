public class TTTUC1 {

    // 3x3 board declaration
    static char[][] board = new char[3][3];

    /**
     * Entry point of the program.
     * Initializes the board and prints it.
     */
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    /**
     * Initializes the board with '-' (empty cells)
     */
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    /**
     * Prints the Tic-Tac-Toe board in proper grid format
     */
    static void printBoard() {
        System.out.println("-------------");

        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}