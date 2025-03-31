package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){
//                System.out.println(matrix[(i*3)][(j*3)] + " " + matrix[(i*3)][(j*3) + 1] + " " + matrix[(i*3)][(j*3) + 2] );
//                System.out.println(matrix[(i*3) + 1][(j*3)] + " " + matrix[(i*3) + 1][(j*3) + 1] + " " + matrix[(i*3) + 1][(j*3) + 2] );
//                System.out.println(matrix[(i*3) + 2][(j*3)] + " " + matrix[(i*3) + 2][(j*3) + 1] + " " + matrix[(i*3) + 2][(j*3) + 2] );
                int sum = matrix[(i*3)][(j*3)] + matrix[(i*3)][(j*3) + 1] + matrix[(i*3)][(j*3) + 2] +
                        matrix[(i*3) + 1][(j*3)] + matrix[(i*3) + 1][(j*3) + 1] + matrix[(i*3) + 1][(j*3) + 2] +
                        matrix[(i*3) + 2][(j*3)] + matrix[(i*3) + 2][(j*3) + 1] + matrix[(i*3) + 2][(j*3) + 2];
                int target = 45 - sum;
                if(target == 0){

                }else{
                    if(matrix[(i*3)][(j*3)] == 0){
                        matrix[(i*3)][(j*3)] = target;
                    }else if(matrix[(i*3)][(j*3) + 1] == 0){
                        matrix[(i*3)][(j*3) + 1] = target;
                    } else if (matrix[(i*3)][(j*3) + 2] == 0) {
                        matrix[(i*3)][(j*3) + 2] = target;
                    } else if (matrix[(i*3) + 1][(j*3)] == 0) {
                        matrix[(i*3) + 1][(j*3)] = target;
                    } else if (matrix[(i*3) + 1][(j*3) + 1] == 0) {
                        matrix[(i*3) + 1][(j*3) + 1] = target;
                    } else if (matrix[(i*3) + 1][(j*3) + 2] == 0) {
                        matrix[(i*3) + 1][(j*3) + 2] = target;
                    } else if (matrix[(i*3) + 2][(j*3)] == 0) {
                        matrix[(i*3) + 2][(j*3)] = target;
                    } else if (matrix[(i*3) + 2][(j*3) + 1] == 0) {
                        matrix[(i*3) + 2][(j*3) + 1] = target;
                    } else if (matrix[(i*3) + 2][(j*3) + 2] == 0) {
                        matrix[(i*3) + 2][(j*3) + 2] = target;
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
}