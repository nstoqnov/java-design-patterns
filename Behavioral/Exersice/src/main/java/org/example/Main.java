package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Digit multiplication
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        while (n > 9){
            n = divideToOneDigit(n);
        }
        System.out.println(n);
    }
    public static int divideToOneDigit(int a){
        int result = a % 10;
        if(result == 0){
            return 0;
        }
        a = a / 10;
        while (a % 10 > 0){
            result = (a % 10) * result;
            a = a / 10;
        }
        return result;
    }
}