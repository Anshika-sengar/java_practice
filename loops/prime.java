package loops;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int primenumber=0;
        int i=2;
        
        if (a <= 1) {
            System.out.println("not prime");
            return;
        }
        while(i<a){
            if(a%i==0){
                primenumber=1;
                break;
            }
            i++;
        }
        if(primenumber==1){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}
