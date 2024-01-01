package com.example.task1;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

// testing using mock() Method
class SinglyLinkedListMockitoTest {

    @Test
    void insert() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        for(int i = 1; i < 7; i++) {
            NodeS<Integer> nodeS = Mockito.mock(NodeS.class);
            nodeS.setData_(i);
            when(nodeS.getData_()).thenReturn(i);
            list.insert(nodeS.getData_());
            int actual;
            actual = list.findNode(i - 1);
            assertEquals(i, actual);
        }

    }

    @Test
    void isEmpty() {
        NodeS<Integer> nodeS;
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        nodeS = Mockito.mock(NodeS.class);

        when(nodeS.isNull()).thenReturn(true);
        assertTrue(list.isEmpty());

        nodeS.setData(56);
        when(nodeS.isNull()).thenReturn(false);
        list.insert(56);
        assertFalse(list.isEmpty());
    }
}