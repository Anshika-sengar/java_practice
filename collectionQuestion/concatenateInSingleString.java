package collectionQuestion;
import java.util.*;
class concatenateInSingleString {
    public static void main(String[] args) {
        System.out.println(concatenate("khushi"));

        System.out.println(concatenate("sengar"));

    }
    public static String concatenate(String... strs) { //variable argument
         StringBuilder sb =new StringBuilder();
         for(String str : strs){ 
            sb.append(str).append(" ");
         }
         return sb.toString();
    }
}
