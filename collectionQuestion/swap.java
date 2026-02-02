package collectionQuestion;
import java.util.*;
public class swap {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(2,3,4,5,6);
        System.out.println(list);
        swapNumber(list, 2, 4);
        System.out.println(list);
    }
    public static void swapNumber(List<Integer> list,int x,int y){
        int swap=list.get(x);
        list.set(x,list.get(y));
        list.set(y,swap);
    }
}
