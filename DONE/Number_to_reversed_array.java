package DONE;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Number_to_reversed_array {
    public static int[] digitize(long n) {
        // Code here
        return null;
    }

    public static void main(String[] args) {
        long n = 35231;
        String sample = String.valueOf(n);
        int[] arr = new int[sample.length()];
        int i = 0;
        long number = 0;
        while(n != 0){
            number = n % 10;
            n /= 10;
            arr[i] = (int)number;
            i++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
