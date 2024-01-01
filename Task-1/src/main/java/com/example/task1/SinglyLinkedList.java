package com.example.task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SinglyLinkedList<T> {
    NodeS<T> head;
    int size;
    public void insert(T value) {
        if(size == 0){
            head = new NodeS<>(value);
        }
        else {
            NodeS<T> current = head;
            while(current.next_ != null) {
                current = current.next_;
            }
            current.next_ = new NodeS<>(value);
        }
        ++size;
    }
    public void print() { // iterative deployment of linked list
        NodeS<T> current = head;
        while(current!= null) {
            System.out.print(current.data_ + " ");
            current = current.next_;
        }
        System.out.print("\n");
    }
    public boolean isEmpty() {
        return size == 0;
    }
    T findNode(int index) {
        if (index >= size || index < 0)
            try {
                throw new IndexOutOfRangeException("Make sure, that index you enter is in range [0, size - 1]");
            } catch (IndexOutOfRangeException e) {
                throw new RuntimeException(e);
            }
        else {
            NodeS<T> current = head;
            int i = 0;
            while (i != index) {
                current = current.next_;
                i++;
            }
            return current.data_;
        }
    }
}
