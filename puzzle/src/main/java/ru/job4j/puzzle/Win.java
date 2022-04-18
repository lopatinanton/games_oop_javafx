package ru.job4j.puzzle;

public class Win {
    public static boolean horizonLine(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean vertLine(int[][] board, int column) {
        boolean result = true;
        for (int[] ints : board) {
            if (ints[column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

        public static boolean check(int[][] board) {
            boolean rsl = false;
            for (int i = 0; i < board.length; i++) {
                if (board[i][i] == 1 && (horizonLine(board, i) || vertLine(board, i))) {
                    rsl = true;
                    break;
                }
            }
            return rsl;
    }
}
