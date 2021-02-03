package com.company.linkedlist;

public class MiddleOfTheLinkedList {


    //    public ListNode middleNode(ListNode head) {
//
////            0 ms, faster than 100.00%
////            Memory Usage: 38.2 MB,
//
//        int length = listLength(head);
//        int middle = length / 2 + 1;
//
//        ListNode returnNode = head;
//        int i = 1;
//        while (i < middle) {
//            returnNode = returnNode.next;
//            i++;
//        }
//        return returnNode;
//    }
//
//    public int listLength(ListNode head) {
//
//        if (head == null) {
//            return 0;
//        }
//
//        int count = 1;
//        while(head.next != null) {
//            count++;
//            head = head.next;
//        }
//        return count;
//    }

    // method with a slow and fast pointer

//    0 ms, faster than 100.00%
//    Memory Usage: 38.2 MB

    public ListNode middleNode(ListNode head) {

        if(head == null) {
            throw new NullPointerException("ListNode argument is null");
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        if(fastPointer.next == null) {
            return slowPointer;
        }

        return slowPointer.next;
    }
}
