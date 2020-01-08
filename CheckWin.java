package TicTacToe;

public class CheckWin {

    // Checks if there is a win
    // Check rows
    // Check cols
    // Check diagonals
    // If board is filled with 3 consecutive X's in a row, return win



    // Instance Method Checks rows of the array to see if there's an X filled in the spot
    public static void checkRows() {
        // Cycles through the rows to see if X is consecutive
        while (true) {
            if (Board.board[0] == "X" && Board.board[1] == "X" && Board.board[2] == "X")
                System.out.println("\nPlayer 1 Wins!!");
            if (Board.board[3] == "X" && Board.board[4] == "X" && Board.board[5] == "X")
                System.out.println("\nPlayer 1 Wins!!");
            if (Board.board[6] == "X" && Board.board[7] == "X" && Board.board[8] == "X")
                System.out.println("\nPlayer 1 Wins!!");

            // Cycles through the rows to see if O is consecutive
            if (Board.board[0] == "O" && Board.board[1] == "O" && Board.board[2] == "O")
                System.out.println("\nPlayer 2 Wins!!");
            if (Board.board[3] == "O" && Board.board[4] == "O" && Board.board[5] == "O")
                System.out.println("\nPlayer 2 Wins!!");
            if (Board.board[6] == "O" && Board.board[7] == "O" && Board.board[8] == "O")
                System.out.println("\nPlayer 2 Wins!!");

        break;
        }
    }


    // Instance Method Checks if the columns of the array are filled with O
    public static void checkColumns() {
        // Cycles through the cols to see if X is consecutive
        if (Board.board[0] == "X" && Board.board[3] == "X" && Board.board[6] == "X")
            System.out.println("\nPlayer 1 Wins!!");
        if (Board.board[1] == "X" && Board.board[4] == "X" && Board.board[7] == "X")
            System.out.println("\nPlayer 1 Wins!!");
        if (Board.board[2] == "X" && Board.board[5] == "X" && Board.board[8] == "X")
            System.out.println("\nPlayer 1 Wins!!");

        // Cycles through the cols to see if O is consecutive
        if (Board.board[0] == "O" && Board.board[3] == "O" && Board.board[6] == "O")
            System.out.println("\nPlayer 2 Wins!!");
        if (Board.board[1] == "O" && Board.board[4] == "O" && Board.board[7] == "O")
            System.out.println("\nPlayer 2 Wins!!");
        if (Board.board[2] == "O" && Board.board[5] == "O" && Board.board[8] == "O")
            System.out.println("\nPlayer 2 Wins!!");
    }


    // Instance Method Checks if there's diagonal win
    public static void checkDiagonals() {
        // Checks diagonals for X
        if (Board.board[0] == "X" && Board.board[4] == "X" && Board.board[8] == "X")
            System.out.println("\nPlayer 1 Wins!!");
        if (Board.board[2] == "X" && Board.board[4] == "X" && Board.board[6] == "X")
            System.out.println("\nPlayer 1 Wins!!");

        // Checks diagonals for O
        if (Board.board[0] == "O" && Board.board[4] == "O" && Board.board[8] == "O")
            System.out.println("\nPlayer 2 Wins!!");
        if (Board.board[2] == "O" && Board.board[4] == "O" && Board.board[6] == "O")
            System.out.println("\nPlayer 2 Wins!!");
    }


    // Instance Method Checks to see if either player wins by checking rows, cols, and diagonals
    public static void checkWin() {
        checkRows();
        checkColumns();
        checkDiagonals();
    }


}
