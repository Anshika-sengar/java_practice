package ARRAY;
import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        k = k % arr.length;

        int[] temp = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            temp[(i + k) % arr.length] = arr[i];
        }

        System.out.println(Arrays.toString(temp));
    }
}
