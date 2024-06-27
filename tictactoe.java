
import java.util.Scanner;

public class TicTacToe {

    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    // Initialize the board with empty spaces 
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the current board 
    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Check if the board is full 
    public boolean isBoardFull() {
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                    break;
                }
            }
        }
        return isFull;
    }

    // Check if the game is over (win or draw) 
    public boolean isGameOver() {
        return (checkRows() || checkColumns() || checkDiagonals() || isBoardFull());
    }

    // Check if a player has won 
    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        return (checkRowCol(board[0][0], board[1][1], board[2][2]) || checkRowCol(board[0][2], board[1][1], board[2][0]));
    }

    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    // Switch player turns 
    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Place a mark at the given position 
    public boolean placeMark(int row, int col) {
        if ((row >= 0) && (row < 3) && (col >= 0) && (col < 3) && (board[row][col] == '-')) {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        game.printBoard();

        while (!game.isGameOver()) {
            System.out.println("Player " + game.currentPlayer + ", enter your move (row [0-2] column [0-2]): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.placeMark(row, col)) {
                game.switchPlayer();
                game.printBoard();
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }

        if (game.isBoardFull()) {
            System.out.println("It's a draw!");
        } else {
            System.out.println("Player " + (game.currentPlayer == 'X' ? 'O' : 'X') + " wins!");
        }
        scanner.close();
    }
}
