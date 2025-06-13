package org.example;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = in.nextInt(); // total numbers
        int m = in.nextInt(); // window size
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (deque.size() > m) {
                int removed = deque.removeFirst();
                map.put(removed, map.get(removed) - 1);
                if (map.get(removed) == 0) {
                    map.remove(removed);
                }

            }
            if (deque.size() == m) {
                max = Math.max(max, map.size());
            }
        }

    }

}