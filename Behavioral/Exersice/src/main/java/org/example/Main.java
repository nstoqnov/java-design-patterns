package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

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
                String[] contact = phonebook[i].split(" ");
                if(contact.length > 2){
                    String newContact = contact[0];
                    for (int j = 1; j < contact.length; j++) {
                        if(!contact[j].equals(phone)){
                            newContact = newContact + " " + contact[j];
                        }
                    }
                    phonebook[i] = newContact;
                }else{
                    phonebook[i] = null;
                }

            }
        }
    }
    private static void getByNumber(String[] phonebook, String phone) {
        String returnValue = "";
        for (int i = 0; i < phonebook.length; i++) {
            if(phonebook[i] != null && phonebook[i].contains(phone)){
                String[] contact = phonebook[i].split(" ");
                returnValue = returnValue + contact[0] + " ";

            }
        }
        String[] retArray = returnValue.split(" ");
        Arrays.sort(retArray);

        for (int i = 0; i < retArray.length; i++) {
            if(i == retArray.length - 1){
                System.out.println(retArray[i]);
            }else{
                System.out.print(retArray[i] + " ");
            }

        }
    }

    private static void getByName(String[] phonebook, String name) {
        String retVal = "";
        for (int i = 0; i < phonebook.length; i++) {
            if(phonebook[i] != null && phonebook[i].contains(name)){
                String[] contact = phonebook[i].split(" ");
                for (int j = 1; j < contact.length; j++) {

                    retVal = retVal + contact[j] + " ";
                }
            }
        }
        String retArr[] = retVal.split(" ");
        Arrays.sort(retArr);

        for (int i = 0; i < retArr.length; i++) {
            if(retArr.length - 1 == i){
                System.out.println(retArr[i]);
            }else{
                System.out.print(retArr[i] + " ");
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