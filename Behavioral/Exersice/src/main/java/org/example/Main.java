package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Digit multiplication
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
    }
    public static void divideToOneDigit(int a){
        int result = 1;
        while (a > 9){
            result = (a % 10) * result;
            a = a / 10;
        }
        a = result;
    }
}