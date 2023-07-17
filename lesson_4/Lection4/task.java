package lesson_4.Lection4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class task {
    public static void main(String[] args) {
        Deque <Integer> dq = new ArrayDeque<Integer>();
        dq.add(12);
        dq.add(123);
        dq.add(17);
        dq.add(1);
        System.out.println(dq);
        dq.addFirst(15);
        dq.addLast(7);
        System.out.println(dq);
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq);
    }
}
