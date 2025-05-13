package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        int k = Integer.parseInt(scanner.next());

        char[][] matrix = new char[n][m];
        char[] win = new char[k];

        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            for (int j = 0; j < input.length(); j++) {
                matrix[i][j] = input.charAt(j);
            }
        }
        String winString = scanner.next();

        //input winning combination
        for (int i = 0; i < k; i++) {
            win[i] = winString.charAt(i);
        }

        //iterate every row
        for (int i = 0; i < n; i++) {
            String row = "";
            for (int j = 0; j < m; j++) {
                row = row + matrix[i][j];
            }
            if(row.contains(winString)){
                System.out.println("Winning");
                return;
            }
        }

        for (int i = 0; i < m; i++) {
            String column = "";
            for (int j = 0; j < n; j++) {
                column = column + matrix[j][i];
            }
            if(column.contains(winString)){
                System.out.println("Winning");
                return;
            }
        }
        System.out.println("Losing");
//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] arr = new int[n + 1];
//
//        for (int i = 0; i < n + 1; i++) {
//            arr[i] = Integer.parseInt(scanner.next());
//        }
//
//        boolean notSorted = true;
//        int counter = 0;
//        while(notSorted){
//            for (int i = 0; i < arr.length - 1; i++) {
//                notSorted = false;
//
//                if(arr[i] > arr[i + 1]){
//                    int temp = arr[i + 1];
//                    arr[i + 1] = arr[i];
//                    arr[i] = temp;
//                    counter++;
//                    notSorted = true;
//                }
//            }
//        }
//
//        System.out.println(counter*10);
    }
}