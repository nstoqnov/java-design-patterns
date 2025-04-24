package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int left = Integer.parseInt(scanner.next());

        int right = Integer.parseInt(scanner.next());

        int odds = 0;
        int evens = 0;

        for (int i = left; i <= right; i++) {
            if(i % 2 == 0){
                evens = evens + i;
            }else{
                odds = odds + i;
            }
        }
        int grade = (Math.abs(odds - evens) % 5) + 2;
        System.out.println(grade);

    }
}