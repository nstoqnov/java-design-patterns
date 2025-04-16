package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());

        String phonebook[] = new String[n];

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String action[] = command.split(" ");

            switch (action[0]){
                case "add":
                    addName(phonebook, action[1], action[2]);
                    break;
            }
        }
    }
    public static void addName(String[] phonebook, String name, String phone){
        boolean found = false;
        for (int i = 0; i < phonebook.length; i++) {
            if(phonebook[i] != null && phonebook[i].contains(name)){
                found = true;
                String newContent = name + " " + phone;
                phonebook[i] = newContent;
            }
        }
        if(found == false){
            for (int i = 0; i < phonebook.length; i++) {
                if(phonebook[i] == null){
                    String newContent = name + " " + phone;
                    phonebook[i] = newContent;
                    break;
                }
            }
        }
    }
}