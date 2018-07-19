package com.CS5343;

public class Queue {

    int[] arr;
    int head = -1;
    int tail = -1;
    int size;

    public Queue( int arrsize) {
        arr= new int[arrsize];
        this.size = 0;
    }

    public boolean push(int n) {
        if (size == arr.length)
            return false;
        head = (head + 1) % arr.length;
        arr[head] = n;
        size++;

        if(tail == -1){
            tail = head;
        }

        return true;
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }
        int e = arr[tail];
        arr[tail] = -1;
        size--;
        tail = (tail+1)%arr.length;

        if (size == 0) {
            head = -1;
            tail = -1;
        }
        return e;
    }

    public int peek(){
        if(size==0)
            return -1;

        return arr[tail];
    }

    public int size() {
        return this.size;
    }
}

