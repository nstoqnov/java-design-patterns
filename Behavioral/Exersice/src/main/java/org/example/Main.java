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
                case "queryname":
                    getByName(phonebook, action[1]);
                    break;
                case "querynum":
                    getByNumber(phonebook,action[1]);
                    break;
                case "delnum":
                    delByNumber(phonebook,action[1]);
                    break;
                case "delname":
                    delByName(phonebook,action[1]);
                    break;
            }
        }
    }

    private static void delByName(String[] phonebook, String name) {
        for (int i = 0; i < phonebook.length; i++) {
            if(phonebook[i] != null && phonebook[i].contains(name)){
                phonebook[i] = null;
            }
        }
    }

    private static void delByNumber(String[] phonebook, String phone) {
        for (int i = 0; i < phonebook.length; i++) {
            if(phonebook[i] != null && phonebook[i].contains(phone)){
                phonebook[i] = null;
            }
        }
    }
    private static void getByNumber(String[] phonebook, String phone) {
        for (int i = 0; i < phonebook.length; i++) {
            if(phonebook[i] != null && phonebook[i].contains(phone)){
                String[] contact = phonebook[i].split(" ");
                System.out.println(contact[0]);
            }
        }
    }

    private static void getByName(String[] phonebook, String name) {
        for (int i = 0; i < phonebook.length; i++) {
            if(phonebook[i] != null && phonebook[i].contains(name)){
                String[] contact = phonebook[i].split(" ");
                for (int j = 1; j < contact.length; j++) {
                    System.out.print(contact[j] + " ");
                }
                System.out.print("\n");
            }
        }
    }

    public static void addName(String[] phonebook, String name, String phone){
        boolean found = false;
        for (int i = 0; i < phonebook.length; i++) {
            if(phonebook[i] != null && phonebook[i].contains(name)){
                found = true;
                String newContent = phonebook[i] + " " + phone;
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