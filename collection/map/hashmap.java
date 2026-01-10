package collection.map; // map is used to store the key ,value pairs.keys are unique but values can be same if you enter a duplicate key then it overrides the previous key if you want that duplicate  will not override the previous key then you have to implement a check
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        Map<String ,Integer> sc =new HashMap<>();
        sc.put("anshika",98);
        sc.put("priya",90);
        sc.putIfAbsent("anshika",56 );//check if anshika key is alread present then it will not override it
        for (Map.Entry<String, Integer> e : sc.entrySet()) { // for iterating over map 
            System.out.println(e.getKey() + " : " + e.getValue());
            System.out.println(e);
        }
        for(String key : sc.keySet()){// use when you want only key
            System.out.println(key);
        }
        for(Integer value:sc.values()){ // use when you want only values
            System.out.println(value);
        }
        System.out.println(sc.containsValue(5)); // return false because the value is not present

        System.out.println(sc.containsKey("sonali")); // return false because the key is not present

        System.out.println(sc.isEmpty()); // return false because map is not empty
        sc.clear(); // used to clear map

    }
}
