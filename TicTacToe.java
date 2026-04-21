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
*/
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