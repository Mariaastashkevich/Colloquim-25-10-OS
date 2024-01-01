package com.example.task1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NodeS<T> {
    public T data_;
    public NodeS<T> next_;
    public NodeS(){
        next_ = null;
    }
    public NodeS(T data) {
        data_ = data;
        next_ = null;
    }
    public boolean isNull() {
        return next_ == null;
    }
    public T setData(T data) {
        data_ = data;
        return data_;
    }
}
