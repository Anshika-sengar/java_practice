package linkedlist;
import java.util.*;
public class collectionLinkedList {
    public static void main(String[] args) {
        List <Integer> LL =new LinkedList<>();
        LL.add(4);//Add value at last
        LL.add(6);
        LL.add(2);
        System.out.println(LL);
        LL.addLast(8);
        System.out.println(LL);
        LL.addFirst(23);
        System.out.println(LL);
        System.out.println(LL);
        for(int i=0;i<LL.size();i++){
            System.out.print(LL.get(i)+"->");
        }
        System.out.println("null");
        LL.remove(2);//delete from index 2
        LL.removeFirst();
        System.out.println(LL);
        LL.removeLast();
        System.out.println(LL);
    }
}
