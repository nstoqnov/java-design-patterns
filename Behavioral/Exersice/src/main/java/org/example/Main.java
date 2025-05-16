package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Digit multiplication
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int result = 1;
        while (n > 9){
            result = (n % 10) * result;
            n = n/10;
        }
        n = result;
        result = 1;
        while(n > 9){
            result = result * n % 10;
            n = n/10;
        }

    }

}