package com.company.LAB_2;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    public List<Integer> list = new ArrayList<>();
    public int max_size = -1;
    public int elements = 0;

    public Queue(int max_size) {
        this.max_size = max_size;
    }

    public Queue() {

    }

    public void push(int value) {
        if (max_size > 0 && (max_size > elements)) {
            list.add(value);
            elements += 1;
        }
        if (max_size == -1) {
            list.add(value);
            elements += 1;
        }
    }

    public void pop() {
        list.remove(0);
        elements -= 1;
    }

    public String ver_if_empty() {
        String result = "Is not empty";
        if (elements == 0) {
            result = "Is empty";
        }
        return result;
    }

    public String ver_if_full() {
        String result = "Is never full";
        if (max_size > 0) {
            if (max_size - elements > 0) {
                result = "Is not full";
            } else result = "Is full";
        }
        return result;
    }

}
