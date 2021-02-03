package com.company.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {

    ListNode head;
    MiddleOfTheLinkedList middle;

    @BeforeEach
    void setUp() {
        this.middle = new MiddleOfTheLinkedList();
        this.head = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        ListNode node4 = new ListNode();
        ListNode node5 = new ListNode();
        ListNode node6 = new ListNode();

        head.val = 1;
        node2.val = 2;
        node3.val = 3;
        node4.val = 4;
        node5.val = 5;
        node6.val = 5;


//        head.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
    }
}