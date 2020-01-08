package TicTacToe;

public class Board {


    // Array to show game board
    static String[] board = {   "-", "-", "-",
                                "-", "-", "-",
                                "-", "-", "-" };

    // Display game board method
    public static void display() {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }



    // Override Display game board method
    public static void display(String[] value) {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

}
