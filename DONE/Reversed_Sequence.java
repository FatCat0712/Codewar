package DONE;

import java.util.Arrays;

public class Reversed_Sequence {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = n;
            n--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
