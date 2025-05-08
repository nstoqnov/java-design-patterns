package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < n; i++) {
            vowels = 0;
            consonants = 0;
            String input = scanner.nextLine();

            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == 'a' ||
                        input.charAt(j) == 'e' ||
                        input.charAt(j) == 'i' ||
                        input.charAt(j) == 'o' ||
                        input.charAt(j) == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
            if(vowels == consonants){
                System.out.println("Yes");
            }else{
                System.out.println("No");
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