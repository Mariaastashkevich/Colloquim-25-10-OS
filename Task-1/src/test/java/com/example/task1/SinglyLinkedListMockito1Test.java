package com.example.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

// testing using Mockito Mock Annotation
class SinglyLinkedListMockito1Test {
    SinglyLinkedList<Integer> list;

    @Mock
    NodeS<Integer> nodeS;
    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void insert() {
        list = new SinglyLinkedList<>();
        for(int i = 1; i < 7; i++) {
            NodeS<Integer> nodeS;
            nodeS = Mockito.mock(NodeS.class);
            nodeS.setData_(i);
            when(nodeS.getData_()).thenReturn(i);
            list.insert(nodeS.getData_());
            int actual = 0;
            actual = (int) list.findNode(i - 1);
            assertEquals(i, actual);
        }
    }

    @Test
    void isEmpty() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        when(nodeS.isNull()).thenReturn(true);
        assertTrue(list.isEmpty());

        nodeS.setData(56);
        when(nodeS.isNull()).thenReturn(false);
        list.insert(56);
        assertFalse(list.isEmpty());
    }
}