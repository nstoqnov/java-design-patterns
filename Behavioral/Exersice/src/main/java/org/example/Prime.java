package org.example;

public class Prime {
    public void checkPrime(int... numbers) {
        for (int n : numbers) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
    public boolean isPrime(int n){
        return true;
    }
}