package collectionQuestion;
import java.util.*;
public class frequency {
    public static void main(String[] args){
        List<Integer> list =Arrays.asList(1,4,5,5,5,5,5,6,7,8,9);
        System.out.println(Collections.frequency(list,5));
    }
}
