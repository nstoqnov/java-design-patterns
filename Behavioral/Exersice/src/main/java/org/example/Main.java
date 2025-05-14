package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Digit multiplication
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());

        while (n > 9){
            n = n/10;
        }
    }

}