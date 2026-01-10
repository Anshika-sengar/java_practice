package collection;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack <String> animals =new Stack<>();
        animals.push("cat");
        animals.push("dog");
        animals.push("elephant");
        animals.push("monkey");
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        System.out.println(animals);
    }
}
