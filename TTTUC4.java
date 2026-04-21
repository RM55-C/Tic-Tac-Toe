import java.util.Scanner;

public class TTTUC4 {

    /**
     * Entry point of the program.
     * Takes user input and converts slot to row & column
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    /**
     * Converts slot number into row index (0–2)
     */
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    /**
     * Converts slot number into column index (0–2)
     */
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}