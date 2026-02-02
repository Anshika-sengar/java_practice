package testingCollections;
import java.util.*;

public class collectionsUtilityClass {
    public static void main(String args[]){
        List<Integer> list =new ArrayList<>();
        list.add(8);
        list.add(5);
        list.add(2);
        list.add(10);
        System.out.println(list);// print whole list once

        for(int i: list){  // loop print element one by one
            System.out.print(i +" ");
        }
        System.out.println();

        Collections.sort(list);
        for(int i: list){
            System.out.print(i +" ");
        }
        System.out.println();

        Collections.reverse(list);
        for(int i: list){
            System.out.print(i +" ");
        }
    
    }
}
