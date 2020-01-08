package TicTacToe;

import java.util.Scanner;


public class Moves {
    static Scanner input = new Scanner(System.in);


    // Let player choose a position on the board
    // After player chooses a position on the board, an X is put down
    // Then display the new board with the player's mark

    // What does this Require:
        // User Input
        // Board


    private static void playerX() {
        System.out.println("\nPlayer1 Turn.");
        System.out.print("Enter a position from 1-9: ");
        int xPosition = input.nextInt() - 1; // Subtract 1 for starting on the board

        // If there's a spot filled on the board then repeat the current player's turn
        if (!(Board.board[xPosition] == "O")) {
            Board.board[xPosition] = "X";
        }
        else {
            Board.display();
            System.out.println("\nPlayer1 Turn.");
            System.out.print("SPOTS TAKEN. TRY AGAIN!: ");
            int position = input.nextInt() - 1; // Subtract 1 for starting on the board
            Board.board[position] = "X";
        }
        Board.display();
    }


    private static void playerO() {
        System.out.println("\nPlayer2 Turn.");
        System.out.print("Enter a position from 1-9: ");
        int oPosition = input.nextInt() - 1; // Subtract 1 for starting on the board

        // If there's a spot filled on the board then repeat the current player's turn
        if (!(Board.board[oPosition] == "X")) {
            Board.board[oPosition] = "O";
        }
        else {
            Board.display();
            System.out.println("\nPlayer2 Turn.");
            System.out.print("SPOTS TAKEN. TRY AGAIN!: ");
            int position = input.nextInt() - 1;
            Board.board[position] = "O";
        }
        Board.display();
    }


    // Cycles through player 1 and player 2
    public static void switchPlayers() {
        Board.display();
        while (true) {
            if (!(Board.board.equals(input)))
                playerX();
                CheckWin.checkWin();
            playerO();
            CheckWin.checkWin();
        }
    }

}
