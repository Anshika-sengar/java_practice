package collection.set;
import java.util.*;// list queue and set is used to store the values
public class hashset {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(98);// O(1) time complexity
        set.add(88);
        set.add(58);
        set.add(68);
        set.add(78);
        set.add(38);
        set.add(28);
        set.add(18);
        set.add(8);
        System.out.println(set);// Hash set does not maintain any order for printing elements (random order )and its does not store dupicate values
        System.out.println(set.size());//in set  hashcode is generated and stored in memory for each element and if we enter any duplicate element then first hash is checked if the hash of that element is already exists in the memory then it does not store it thats why duplicates are not alowed
        System.out.println(set.remove(78));
        System.out.println(set);
        System.out.println(set.contains(68));
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);

    }
}
