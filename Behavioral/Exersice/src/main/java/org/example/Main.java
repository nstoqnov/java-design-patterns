package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = 0; i < n; i++) {
            String egn = scanner.nextLine();

            if(egn.charAt(8) % 2 == 0){
                counter++;
            }
        }

        System.out.println(counter);
    }
}