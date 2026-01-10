package collection.map;// tree map is basically like a treeset maintain sorted order according to keys follow binary search tree
import java.util.*;
public class treemap {
    public static void main(String[] args) {
        Map<String ,Integer> sc =new TreeMap<>();
        sc.put("anshika",98);
        sc.put("priya",90);
        sc.putIfAbsent("anshika",56 );//check if anshika key is alread present then it will not override it
        for (Map.Entry<String, Integer> e : sc.entrySet()) { // for iterating over map 
            System.out.print(e.getKey() + " : " + e.getValue());
        }
        System.out.println();
        for(String key : sc.keySet()){// use when you want only key
            System.out.println(key);
        }
        System.out.println();
        for(Integer value:sc.values()){ // use when you want only values
            System.out.println(value);
        }
        System.out.println();
        System.out.println(sc.containsValue(5)); // return false because the value is not present
        sc.remove(8);
        System.out.println(sc.containsKey("sonali")); // return false because the key is not present
        for (Map.Entry<String, Integer> e : sc.entrySet()) { // for iterating over map 
            System.out.println(e);
        }

        System.out.println(sc.isEmpty()); // return false because map is not empty
        sc.clear(); // used to clear map

    }
}
