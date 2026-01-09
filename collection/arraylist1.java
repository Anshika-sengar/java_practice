package arraylist;
import java.util.*;
public class arraylist1{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(45);
        list.add(90);
        ArrayList<Integer> newlist=new ArrayList<>();
        newlist.add(199);
        list.addAll(newlist);
        for(Integer i:list){
            System.out.print(i);
        }
        for(int i=0;i<list.size();i++){
            System.out.println("elements are "+list.get(i));
        }
    }
    
}
