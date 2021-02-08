package com.company;

import com.company.linkedlist.ListNode;
import com.company.linkedlist.MergeTwoSortedLists;
import com.company.linkedlist.PalindromeLinkedList;

public class Main {

    public static void main(String[] args) {
        ListNode listNode11 = new ListNode();
        ListNode listNode12 = new ListNode();
        ListNode listNode13 = new ListNode();
//        ListNode listNode14 = new ListNode();
////        ListNode listNode15 = new ListNode();
////
////        ListNode listNode21 = new ListNode();
////        ListNode listNode22 = new ListNode();
////        ListNode listNode23 = new ListNode();
////        ListNode listNode24 = new ListNode();
////        ListNode listNode25 = new ListNode();
////
        listNode11.val = 1;
        listNode12.val = 2;
        listNode13.val = 1;
//////        listNode14.val = 7;
//////        listNode15.val = 8;
////
////        listNode21.val = 1;
////        listNode22.val = 3;
////        listNode23.val = 4;
//////        listNode24.val = 5;
//////        listNode25.val = 6;
////
        listNode11.next = listNode12;
        listNode12.next = listNode13;
//////        listNode13.next = listNode14;
//////        listNode14.next = listNode15;
////
////        listNode21.next = listNode22;
////        listNode22.next = listNode23;
//////        listNode23.next = listNode24;
//////        listNode24.next = listNode25;
////
////        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
////        printList(mergeTwoSortedLists.mergeTwoLists(listNode11, listNode21));

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        System.out.println(palindromeLinkedList.isPalindrome(listNode11));

    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("null");
    }


}
