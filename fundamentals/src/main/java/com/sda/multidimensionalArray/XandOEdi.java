package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] newBoard = createBoard();
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;

        do {

            do {
                System.out.println("X is your turn.");
                System.out.println("Choose row (1,2,3)");
                row = scanner.nextInt() - 1;
                System.out.println("Choose column (1,2,3)");
                column = scanner.nextInt() - 1;
            } while (!xMove(newBoard, row, column));

            printBoard(newBoard);
            if (gameFinished2(newBoard)) {
                break;
            }

            do {
                System.out.println("0 is your turn.");
                System.out.println("Choose row (1,2,3)");
                row = scanner.nextInt() - 1;
                System.out.println("Choose column (1,2,3)");
                column = scanner.nextInt() - 1;
            } while (!oMove(newBoard, row, column));
            printBoard(newBoard);

        } while (!gameFinished2(newBoard));

    }
    public static String[][] createBoard() {
        String[][] newBoard = new String[3][3];
        for (int i = 0; i < newBoard.length; i++) {
            for (int j = 0; j < newBoard[i].length; j++) {
                newBoard[i][j] = "[ ]";
            }
        }
        return newBoard;
    }

    public static boolean xMove(String[][] xoBoard, int row, int column) {
        if (xoBoard[row][column].equals("[ ]")) {
            xoBoard[row][column] = "[X]";
            return true;
        } else return false;
    }

    public static boolean oMove(String[][] xoBoard, int row, int column) {
        if (xoBoard[row][column].equals("[ ]")) {
            xoBoard[row][column] = "[O]";
            return true;
        } else return false;
    }

    public static boolean gameFinished2(String[][] board) {
        int xCount = 0;
        int oCount = 0;
        int xCount2 = 0;
        int oCount2 = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j].equals("[X]")) {
                    xCount++;
                } else if (board[i][j].equals("[O]")) {
                    oCount++;
                }

            }
            if (xCount == 3) {
                System.out.println("X is the winner");
                return true;
            } else if (oCount == 3) {
                System.out.println("O is the winner");
                return true;
            } else {
                xCount = 0;
                oCount = 0;
            }
        }

        xCount = 0;
        oCount = 0;

        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (board[j][i].equals("[X]")) {
                    xCount++;
                } else if (board[j][i].equals("[O]")) {
                    oCount++;
                }

            }
            if (xCount == 3) {
                System.out.println("X is the winner");
                return true;
            } else if (oCount == 3) {
                System.out.println("O is the winner");
                return true;
            } else {
                xCount = 0;
                oCount = 0;
            }
        }


        for (int i = 0; i < board.length; i++) {

            if (board[i][i].equals("[X]")) {
                xCount2++;
            } else if (board[i][i].equals("[O]")) {
                oCount2++;
            }
        }

        if (xCount2 == 3) {
            System.out.println("X is the winner");
            return true;
        } else if (oCount2 == 3) {
            System.out.println("O is the winner");
            return true;
        } else {
            xCount2 = 0;
            oCount2 = 0;
        }

        for (int i = board.length - 1; i >= 0; i--) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j].equals("[X]")) {
                    xCount2++;
                } else if (board[i][j].equals("[O]")) {
                    oCount2++;
                }
            }
        }

        if (xCount2 == 3) {
            System.out.println("X is the winner");
            return true;
        } else if (oCount2 == 3) {
            System.out.println("O is the winner");
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals("[ ]")) {
                    return false;

                }
            }
        }
        System.out.println("Its a tie!");
        return true;

    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
