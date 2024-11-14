package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        if(singleton.value.equals(anotherSingleton.value)) {
            System.out.println("singleton equals anotherSingleton value");
        }else{
            System.out.println("singleton not equals anotherSingleton value");
        }
    }
}