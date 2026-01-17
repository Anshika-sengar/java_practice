package loops;
import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int first=sc.nextInt();
        System.out.println("enter second: ");
        int second=sc.nextInt();
        int result=divisor(first,second);
        System.out.println(result);
    }
    public static int divisor(int first,int second){
        int greatest=1;
        int i=2;
        int least=Math.min(first, second);
        while (i<=least) {
            if(first%i==0 && second%i==0){
                greatest=i;
            }
            i++;
        }
        return greatest;
    }
    
}