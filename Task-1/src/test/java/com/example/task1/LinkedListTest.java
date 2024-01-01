package com.example.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    @DisplayName("Insert Function is proofed")
    void insert() {
        SinglyLinkedList<Integer> singly = new SinglyLinkedList<>();
        assertTrue(singly.isEmpty());
        assertEquals(0, singly.size);

        singly.insert(123);
        assertFalse(singly.isEmpty());
        assertEquals(1, singly.size);
    }
}