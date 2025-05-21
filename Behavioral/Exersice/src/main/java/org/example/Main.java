package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Digit multiplication
        Scanner scanner = new Scanner(System.in);
        Long n = Long.parseLong(scanner.next());
        while (n > 9){
            n = divideToOneDigit(n);
        }
        System.out.println(n);
    }
    public static Long divideToOneDigit(Long a){
        Long result = a % 10;
        if(result == 0){
            return 0L;
        }
        a = a / 10;
        while (a % 10 > 0){
            result = (a % 10) * result;
            a = a / 10;
        }
        return result;
    }
}