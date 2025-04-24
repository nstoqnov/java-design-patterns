package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int price = Integer.parseInt(scanner.next());
        int exchange = Integer.parseInt(scanner.next());
        int amount = Integer.parseInt(scanner.next());

        int chocolates = amount / price;
        int wrappers = chocolates;

        while (wrappers >= exchange) {
            int newChocolates = wrappers / exchange;
            chocolates += newChocolates;
            wrappers = (wrappers % exchange) + newChocolates;
        }

        System.out.println(chocolates);
    }
}