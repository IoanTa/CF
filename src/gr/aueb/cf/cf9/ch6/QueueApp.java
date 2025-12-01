package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

/*
Queues use FIFO (First In First Out) logic.
enqueue() - Εισάγει
dequeue() - Εξάγει
 */
public class QueueApp {
    static int[] queue = new int[10];
    static int top = -1;

    public static void main(String[] args) {

    }

    public static void enqueue(int val) {
        if (isFull()) {
            throw new RuntimeException("Que is full!");
        }
        queue[++top] = val;
    }

    public static int dequeue() {
        int num;
        if (isEmpty()) {
            throw new RuntimeException("Que is empty");
        }
        num = queue[0];
        queue = Arrays.copyOfRange(queue, 1, queue.length);
        top--;
        return num;

    }

    public static boolean isEmpty() {
        return top == - 1;
    }

    public static boolean isFull() {
        return top == queue.length - 1;
    }

    public static void printQueue() {
        if (isEmpty()) {

        }
    }
}


