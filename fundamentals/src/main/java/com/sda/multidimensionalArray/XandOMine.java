package com.company;

import java.util.Scanner;

public class XandOMine {
    public static void main(String[] args) {
        String[][] boardGame = createBoard();
        Scanner input = new Scanner(System.in);
        boolean condition;
        boolean finishTheGameOnColumn;
        do {
            displayBoard(boardGame);
            boolean validMove;
            do {
                System.out.println("It's X's turn. Choose a row:");
                int xRow = input.nextInt();
                System.out.println("Choose a column:");
                int xColumn = input.nextInt();
                validMove = xMakesAMove(boardGame, xRow, xColumn);

            } while (!validMove);
            condition = gameOver(boardGame);
            if (condition) {
                break;
            }
            displayBoard(boardGame);
            boolean oMoved;
            do {
                System.out.println("It's O's turn. Choose a row:");
                int oRow = input.nextInt();
                System.out.println("Choose a column:");
                int oColumn = input.nextInt();
                oMoved = oMakesAMove(boardGame, oRow, oColumn);
            } while (!oMoved);
            condition = gameOver(boardGame);
        } while (!condition);
    }

    public static String[][] createBoard() {
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "[ ]";
            }
        }
        return board;
    }

    public static boolean xMakesAMove(String[][] boardGame, int row, int column) {
        if (boardGame[row][column].equals("[ ]")) {
            boardGame[row][column] = "X";
            return true;
        } else {
            System.out.println("Invalid move. Try again!");
            return false;
        }
    }

    public static boolean oMakesAMove(String[][] boardGame, int row, int column) {
        if (boardGame[row][column].equals("[ ]")) {
            boardGame[row][column] = "O";
            return true;
        } else {
            System.out.println("Invalid move. Try again!");
            return false;
        }
    }

    public static void displayBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean gameOver(String[][] board) {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals("X")) {
                    countX++;
                } else if (board[i][j].equals("O")) {
                    countO++;
                }
            }
            if (countX == 3) {
                System.out.println("Game over! X wins!");
                return true;
            } else if (countO == 3) {
                System.out.println("Game over. O wins!");
                return true;
            }
            //Se poate si fara ramura de else pt ca metoda returneaza false si se va reapela de la capat iar
            //countx si count0 vor fi initializate cu 0
//            else {
//                countX = 0;
//                countO = 0;
//            }
            }
            int x = 0;
            int o = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[j][i].equals("X")) {
                        x++;
                    } else if (board[j][i].equals("O")) {
                        o++;
                    }
                }
            }
                if (x == 3) {
                    System.out.println("Game over! X wins!");
                    return true;
                } else if (o == 3) {
                    System.out.println("Game over. O wins!");
                    return true;
                }
//                else {
//                    x = 0;
//                    o = 0;
//                }

            int xWinnings = 0;
            int oWinnings = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (i == j) {
                        if (board[i][j].equals("X")) {
                            xWinnings++;
                        } else if (board[i][j].equals("O")) {
                            oWinnings++;
                        }
                    }
                }
            }
                if (xWinnings == 3) {
                    System.out.println("Game over! X wins!");
                    return true;
                } else if (oWinnings == 3) {
                    System.out.println("Game over. O wins!");
                    return true;
                }

            int xCounter=0;
            int oCounter = 0;
            for(int i=0;i< board.length;i++){
                for(int j= board.length-1;j>=0;j--){
                    if (board[i][j].equals("X")) {
                        xCounter++;
                    } else if (board[i][j].equals("O")) {
                        oCounter++;
                    }
                }
            }
        if (xCounter == 3) {
            System.out.println("Game over! X wins!");
            return true;
        } else if (oCounter == 3) {
            System.out.println("Game over. O wins!");
            return true;
        }
            return false;
        }
    }



