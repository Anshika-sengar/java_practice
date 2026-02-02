package ARRAY;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        k = k % arr.length; // if k > length

        int[] temp = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            temp[i] = arr[(i + k) % arr.length];
        }

        System.out.println(Arrays.toString(temp));
    }
}
