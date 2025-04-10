package org.example;

import java.util.Scanner;

public class Main {
    public static ListNode resList = new ListNode(0);
    public static ListNode head = resList;
    public static int carry = 0;
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        ListNode l1p = new ListNode(4);
        ListNode l1pp = new ListNode(3);

        l1.next = l1p;
        l1p.next = l1pp;

        ListNode l2 = new ListNode(5);
        ListNode l2p = new ListNode(6);
        ListNode l2pp = new ListNode(4);

        l2.next = l2p;
        l2p.next = l2pp;

        addTwoNumbers(l1, l2);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val + carry;
        carry  = sum / 10;
        resList.next = new ListNode(sum % 10);
        resList = resList.next;

        if(l1.next != null && l2.next != null){
            addTwoNumbers(l1.next, l2.next);
        } else if (l1.next != null) {
            addTwoNumbers(l1.next, new ListNode(0));
        } else if (l2.next != null) {
            addTwoNumbers(new ListNode(0), l2.next);
        }else if(carry > 0){
            resList.next = new ListNode(1);
            resList = resList.next;
        }
        return head.next;
    }
}