package com.company.linkedlist;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

//        0 ms, faster than 100.00%
//        Memory Usage: 38.2 MB, less than 88.14%

        // null check on both nodes
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        //
        ListNode head;
        ListNode current;

        // check to see which node has the lowest value, then set it to the head node.
        if (l1.val <= l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }

        current = head;
        while(l1 != null || l2 != null) {

            // if we are at the end of one list, add the rest of the other to the tail
            if(l1 == null) {
                current.next = l2;
                return head;
            } else if (l2 == null) {
                current.next = l1;
                return head;
            }

            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;

        }
        return head;
    }

}
