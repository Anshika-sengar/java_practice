package collection.set;
import java.util.*;
public class linkedHashset {
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
        set.add(98);
        set.add(88);
        set.add(58);
        set.add(68);
        set.add(78);
        set.add(38);
        set.add(28);
        set.add(18);
        set.add(8);
        System.out.println(set);// linkedHashSet maintains a order like linked list
        System.out.println(set.size());
        System.out.println(set.remove(78));
        System.out.println(set);
        System.out.println(set.contains(68));
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);

    }
}
