package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int price = Integer.parseInt(scanner.next());

        int exchange = Integer.parseInt(scanner.next());

        int amount = Integer.parseInt(scanner.next());

        int result = 0;
        int rem = 0;
        int ex = 0;

        result =amount / price;

        ex = result / exchange;

        result = result + ex;
        while(ex >= exchange){
            result = result + (ex / exchange);
            ex = (ex / exchange) + (ex % exchange);
        }

        System.out.println(result);
    }
}