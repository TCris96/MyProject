package com.sda.array;

import java.util.Scanner;

public class ChessTable {
    public static void main(String[] args) {
        String[][] board = createChessTable();
        display(board);
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("1.Display the chess board");
            System.out.println("2. Move the pawn");
            System.out.println("0.Exit");
            option = scanner.nextInt();
            if (option == 1) {
                display(board);
            } else if (option == 2) {
                System.out.println("Enter the coordinates of the pawn that you want to move:");
                int xFrom = scanner.nextInt();
                int yFrom = scanner.nextInt();
                System.out.println("Enter the coordinates of the space where you want to move the pawn:");
                int xTo = scanner.nextInt();
                int yTo = scanner.nextInt();
                boolean validMove = moveChess(board, xFrom, yFrom, xTo, yTo);
                if (!validMove) {
                    System.out.println("Invalid move!");
                }
            }
        } while (option != 0);
    }

    public static String[][] createChessTable() {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = "[ ]";
            }
        }
        for (int i = 0; i < chessBoard.length; i++) {
            chessBoard[i][1] = "[P]";
            chessBoard[i][6] = "[R]";
        }
        return chessBoard;
    }

    public static void display(String[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean moveChess(String[][] chessBoard, int xFrom, int yFrom, int xTo, int yTo) {
        if (!chessBoard[xFrom][yFrom].equals("[P]") || chessBoard[xTo][yTo].equals("[R]")) {
            return false;
        } else {
            boolean validInFront = xTo == xFrom && (yTo == yFrom + 1 || yTo == yFrom + 2);
            if (validInFront) {
                chessBoard[xTo][yTo] = "[P]";
                chessBoard[xFrom][yFrom] = "[ ]";
                return true;
            }
        }
        return false;
    }
}
