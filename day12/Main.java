package day12;

import java.util.ArrayList;

class QueueDS {
    int front;
    int rear;
    int capacity;
    ArrayList<Integer> arr;

    public QueueDS(int capacity) {
        this.capacity = capacity;
        this.front = -1;
        this.rear = -1;
        arr = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            arr.add(0);
        }
    }

    

    public void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full .... ");
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr.set(rear, data);
    }
    public int deque() {
        if (front == -1 || front > rear) {
            System.out.println("queue is empty ... ");
            return -1;
        }

        int deletedEle = arr.get(front);
        front++;
        return deletedEle;
    }
    public int front() {
        if (front == -1) {
            System.out.println("queue is empty ... ");
            return -1;
        }
        return arr.get(front);
    }
    public int back() {
        if (rear == -1) {
            System.out.println("Queue is empty .... ");
            return -1;
        }
        return arr.get(rear);
    } 
}


public class Main {
    public static void main(String[] args) {
        QueueDS q = new QueueDS(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.front();
        System.out.println("Dequeued: " + q.deque());
        System.out.println(q.front());
        System.out.println(q.back());
    }
}


