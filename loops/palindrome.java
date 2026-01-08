package loops;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int reverse=0;
        int number=a;
        while(a>0){
            int digit=a%10;
            reverse=reverse*10+digit;
            a=a/10;
        }
        if(number==reverse){
            System.out.println("palindrone");
        }
        else{
            System.out.println("not palindrone");
        }
    }
}
