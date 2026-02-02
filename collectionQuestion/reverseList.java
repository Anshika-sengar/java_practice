package collectionQuestion;
import java.util.*;
public class reverseList {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("before swapping "+list);
        Collections.reverse(list);
        System.out.println("After swapping "+list);
    }
}
