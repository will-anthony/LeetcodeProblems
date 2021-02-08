package com.company.linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLinkedList {

//    Runtime: 2 ms, faster than 41.79%
//    Memory Usage: 42.8 MB, less than 42.27%

    public boolean isPalindrome(ListNode head) {
        int listSize = size(head);
        Deque<Integer> palindromeTracker = new LinkedList<>();

        int count = 0;
        while (count < listSize / 2) {
            palindromeTracker.push(head.val);
            head = head.next;
            count ++;
        }
        if (listSize % 2 != 0) {
            head = head.next;
        }
        while (head != null) {
            if (head.val != palindromeTracker.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }


    private int size(ListNode node) {
        int count = 0;

        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
}
