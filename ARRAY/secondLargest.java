package ARRAY;
import java.util.*;
public class secondLargest {
    public static void main(String[] args){
        int arr[]={ 2,4,9,8,7};
        Arrays.sort(arr);
        int largest =arr[arr.length-1];
        int i = arr.length-2;
        while(i>=0 && arr[i]==largest){
            i--;
        }
        if(i>=0){
            System.out.println(" second largest -> " +arr[i]);
        }
        else{
            System.out.println("no second largest");
        }
    }
}
