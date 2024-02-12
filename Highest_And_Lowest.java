import java.util.ArrayList;
import java.util.Collections;

public class Highest_And_Lowest {
    public static String highAndLow(String numbers) {
        String[] handle = numbers.split(" ");
        int[] arr = new int[handle.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(handle[i]);
        }
        int max = findMax(arr);
        int min = findMin(arr);
        return max + " " + min;

    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return  max;

    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        String sample = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(highAndLow(sample));




    }
}
