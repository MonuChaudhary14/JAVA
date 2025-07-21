import java.util.Scanner;

public class TicTacToe{

    public static boolean winner(char[][] tic) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (tic[i][0] != ' ' && tic[i][0] == tic[i][1] && tic[i][1] == tic[i][2]) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (tic[0][j] != ' ' && tic[0][j] == tic[1][j] && tic[1][j] == tic[2][j]) {
                return true;
            }
        }

        // Check diagonals
        if (tic[0][0] != ' ' && tic[0][0] == tic[1][1] && tic[1][1] == tic[2][2]) {
            return true;
        }
        if (tic[0][2] != ' ' && tic[0][2] == tic[1][1] && tic[1][1] == tic[2][0]) {
            return true;
        }

        return false;
    }

    public static void print(char[][] tic) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tic[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tic = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tic[i][j] = ' ';
            }
        }
        int count = 0;

        print(tic);

        while (true) {
            int row;
            int col;

            if (count >= 9) {
                System.out.println("It is a draw");
                break;
            }

            // Player 1
            System.out.print("Player 1 (O) -> ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row < 0 || row > 2 || col < 0 || col > 2 || tic[row][col] != ' ') {
                System.out.println("Invalid move. Try again.");
                continue;
            }
            tic[row][col] = 'O';
            count++;
            print(tic);
            if (winner(tic)) {
                System.out.println("Congratulations! Player 1 Wins");
                break;
            }

            if (count >= 9) {
                System.out.println("It is a draw");
                break;
            }

            // Player 2
            System.out.print("Player 2 (X) -> ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row < 0 || row > 2 || col < 0 || col > 2 || tic[row][col] != ' ') {
                System.out.println("Invalid move. Try again.");
                continue;
            }
            tic[row][col] = 'X';
            count++;
            print(tic);
            if (winner(tic)) {
                System.out.println("Congratulations! Player 2 Wins");
                break;
            }
        }

        scanner.close();
    }
}
