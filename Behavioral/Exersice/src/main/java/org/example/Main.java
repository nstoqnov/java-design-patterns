package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());

        for (int i = 0; i < n; i++) {

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