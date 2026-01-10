package collection;
import java.util.*;
public class priority {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(89);
        pq.add(98);
        pq.offer(76);
        pq.add(23);
        System.out.println(pq.peek());
        System.out.println(pq.element());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.remove());
        System.out.println(pq);
    }
}
