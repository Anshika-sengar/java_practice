// // package loops;
// // import java.util.Scanner;
// // public class ArmStrong {
// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         int a=sc.nextInt();
// //         boolean armstrong=isarmstrong(a);
// //         if(armstrong){
// //             System.out.println("armstrong");
// //         }
// //         else{
// //             System.out.println("not armstrong");
// //         }
// //     }
// //     public static boolean isarmstrong(int num){
// //         int noOfDigit=count(num);
// //         int numCopy=num;
// //         int finalnumber=0;
// //         while(num>0){
// //             int lastdigit=num%10;
// //             num/=10; 
// //             finalnumber+=power(lastdigit,noOfDigit);
// //         }
// //         return finalnumber==numCopy;
// //     }
// //     public static int power(int num1,int num2){
// //         int result=1;
// //         int i=0;
// //         while(i<num2){
// //             result*=num1;
// //             i++;
// //         }
// //         return result;
// //     }
// //     public static int count(int num){
// //         int count=0;
// //         while (num>0) {
// //             count++;
// //             num=num/10;
// //         }

// //         return count;
// //     }
// // }
// package loops;
// import java.util.Scanner;

// public class ArmStrong {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         int temp = num;
//         int sum = 0;

//         while (temp > 0) {
//             int digit = temp % 10;
//             sum = sum + (digit * digit * digit); // cube
//             temp = temp / 10;
//         }

//         if (sum == num) {
//             System.out.println("armstrong");
//         } else {
//             System.out.println("not armstrong");
//         }
//     }
// }
