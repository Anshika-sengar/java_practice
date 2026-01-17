package loops;
import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number: ");
        int first=sc.nextInt();
        System.out.println("enter second number");
        int second=sc.nextInt();
        int result=lcm(first,second);
        System.out.println(result);
    }
    public static int lcm(int first,int second){
        int i=1;
        while(i<=second){
            int factor=first*i;
            if(factor%second==0){
                return factor;
            }
            i++;
        }
        return 0;
    }
    
}

