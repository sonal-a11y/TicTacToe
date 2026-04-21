/*public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // Initialize the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Display the board
        System.out.println("Tic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class TicTacToe {
    public static void main(String[] args) {

        // Using fully qualified class name instead of import
        java.util.Random rand = new java.util.Random();

        int toss = rand.nextInt(2);

        String player1 = "Player 1";
        String player2 = "Player 2";

        char symbol1, symbol2;
        String currentPlayer;

        if (toss == 0) {
            currentPlayer = player1;
            symbol1 = 'X';
            symbol2 = 'O';
        } else {
            currentPlayer = player2;
            symbol2 = 'X';
            symbol1 = 'O';
        }

        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " starts first!");
        System.out.println(player1 + " symbol: " + symbol1);
        System.out.println(player2 + " symbol: " + symbol2);
    }
}

public class TicTacToe {

    // Method to get slot input from user
    public static int getSlot() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

    public static void main(String[] args) {
        int chosenSlot = getSlot();

        System.out.println("You selected slot: " + chosenSlot);
    }
}

public class TicTacToe {

    // Method to convert slot into row and column
    public static void convertSlot(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    public static void main(String[] args) {
        int slot = 5; // example input
        convertSlot(slot);
    }
}

public class TicTacToe {

    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == '-');
    }

    public static void main(String[] args) {

        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        int row = 1, col = 2;

        if (isValidMove(board, row, col))
            System.out.println("Valid Move");
        else
            System.out.println("Invalid Move");
    }
}
*/
public class TicTacToe {

    // Method to place symbol on board
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        placeMove(board, 1, 1, 'X');

        // Display board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}