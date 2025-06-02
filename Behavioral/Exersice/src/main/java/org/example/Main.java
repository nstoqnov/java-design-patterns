package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");

        while(testCases-- > 0) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2)); // print the content
                found = true;
            }
            if (!found) {
                System.out.println("None");
            }
        }
        in.close();
    }

}