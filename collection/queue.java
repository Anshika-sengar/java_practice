package collection;
import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(90);
        queue.offer(50);
        queue.offer(32);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

    }
}
