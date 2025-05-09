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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.next().charAt(j);
            }
        }


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