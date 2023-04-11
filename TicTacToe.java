import java.util.Scanner;

public class TicTacToe {
    private static final int BOARD_SIZE = 3;
    private static final char PLAYER_1_SYMBOL = 'X';
    private static final char PLAYER_2_SYMBOL = 'O';
    private static final char EMPTY_SYMBOL = ' ';
    private static final int NUM_PLAYERS = 2;

    private char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
    private int currentPlayerIndex = 0;
    private int numMoves = 0;
    private boolean gameOver = false;

    public TicTacToe() {
        // Initialize the board to be empty
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY_SYMBOL;
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            // Print the current state of the board
            printBoard();

            // Get the current player's move
            int row, col;
            do {
                System.out.printf("Player %d, enter row (1-%d) and column (1-%d): ", currentPlayerIndex + 1, BOARD_SIZE, BOARD_SIZE);
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            } while (!isValidMove(row, col));

            // Update the board
            board[row][col] = getCurrentPlayerSymbol();
            numMoves++;

            // Check for a winner
            if (hasWinner(row, col)) {
                System.out.printf("Player %d wins!\n", currentPlayerIndex + 1);
                gameOver = true;
            } else if (numMoves == BOARD_SIZE * BOARD_SIZE) {
                System.out.println("Game over: tie");
                gameOver = true;
            } else {
                // Switch to the next player
                currentPlayerIndex = (currentPlayerIndex + 1) % NUM_PLAYERS;
            }
        }

        scanner.close();
    }

    private boolean isValidMove(int row, int col) {
        if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
            return false;
        }
        if (board[row][col] != EMPTY_SYMBOL) {
            return false;
        }
        return true;
    }

    private boolean hasWinner(int row, int col) {
        char symbol = getCurrentPlayerSymbol();

        // Check row
        for (int j = 0; j < BOARD_SIZE; j++) {
            if (board[row][j] != symbol) {
                break;
            }
            if (j == BOARD_SIZE - 1) {
                return true;
            }
        }

        // Check column
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][col] != symbol) {
                break;
            }
            if (i == BOARD_SIZE - 1) {
                return true;
            }
        }

        // Check diagonal
        if (row == col) {
            for (int i = 0; i < BOARD_SIZE; i++) {
                if (board[i][i] != symbol) {
                    break;
                }
                if (i == BOARD_SIZE - 1) {
                    return true;
                }
            }
        }

        // Check anti-diagonal
        if (row + col == BOARD_SIZE - 1) {
            for (int i = 0; i < BOARD_SIZE; i++) {
                if (board[i][
