public class TTTUC5 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '2', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program.
     * Tests the validation logic
     */
    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1)); // Example test
    }

    /**
     * Checks if the given row and column are valid
     * and if the cell is empty
     */
    static boolean isValidMove(int row, int col) {

        // Check boundaries (0 to 2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        // If both conditions satisfied
        return true;
    }
}