package loops;

import java.util.Scanner;

public class sumOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int a=sc.nextInt();
        int result=sum(a);
        System.out.println(result);
    }
    public static int sum(int b){
        int add=0;
        for(int i=0;i<=b;i++){
            if(i%2!=0){
                add+=i;
            }
        }
        return add;
    }
}
