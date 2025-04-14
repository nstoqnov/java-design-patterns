package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 0, 2, 0, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 0, 7, 0, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(matrix[i][j] == 0){
                    for (int k = 1; k <= 9; k++) {
                        if(isValidPlacement(matrix,k,i,j)){
                            matrix[i][j] = k;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static boolean isNumberInRow(int[][] matrix, int number, int row){
        for (int i = 0; i < 9; i++) {
            if(matrix[row][i] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] matrix, int number, int column){
        for (int i = 0; i < 9; i++) {
            if(matrix[i][column] == number){
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] matrix, int number, int row, int column){
        int currentRow = row - row % 3;
        int currentColumn = column - column % 3;

        for (int i = currentRow; i < currentRow + 3; i++) {
            for (int j = currentColumn; j < currentColumn + 3; j++) {
                if(matrix[i][j] == number){
                    return true;
                }
            }
        }

        return  false;
    }

    private static boolean isValidPlacement(int[][] matrix, int number, int row, int column){
        return !isNumberInRow(matrix,number,row) &&
                !isNumberInColumn(matrix,number, column) &&
                !isNumberInBox(matrix, number, row, column);
    }
}