package collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class arraydq {// doubly queue
    public static void main(String[] args) {
        ArrayDeque <Integer> aq = new ArrayDeque<>();
        aq.addLast(30);
        aq.offer(34);
        aq.addFirst(54);
        System.out.println(aq);
        System.out.println();
        aq.peek();
        aq.peekFirst();
        aq.peekLast();
        System.out.println(aq.poll());
        System.out.println(aq.pollLast());
        aq.add(12);
        System.out.println(aq);
        System.err.println(aq.pollFirst());



    }
}
