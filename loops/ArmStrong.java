package loops;  //  package name (file should be inside loops folder)

import java.util.Scanner;  //  Scanner is used to take input from user

public class ArmStrong {
    public static void main(String[] args) {

        //  create Scanner object for input
        Scanner sc = new Scanner(System.in);

        //  take number input from user
        int num = sc.nextInt();

        //  temp is used because we will modify it in loop
        int temp = num;

        //  sum will store the sum of cubes of digits
        int sum = 0;

        // loop runs until temp becomes 0
        while (temp > 0) {

            // get last digit of the number
            int digit = temp % 10;

            //  add cube of digit into sum (digit^3)
            sum = sum + (digit * digit * digit);

            //  remove last digit from temp
            temp = temp / 10;
        }

        //  if sum is equal to original number then it is Armstrong
        if (sum == num) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }

        // close scanner (good practice)
        sc.close();
    }
}
