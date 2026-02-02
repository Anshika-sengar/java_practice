package collectionQuestion;

import java.util.*;

public class uniqueCharacterUsingSet {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your String : ");
        String userString = sc.next();
        for (char ch : userString.toCharArray()) {
            unique.add(ch);
        }
        System.out.printf("your string has %d unique character", unique.size());
    }
}
