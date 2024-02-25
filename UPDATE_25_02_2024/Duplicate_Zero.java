package UPDATE_25_02_2024;

import java.util.Arrays;

public class Duplicate_Zero {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,4,5};
        int[] result = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(j < result.length){
                if(arr[i] == 0){
                    j += 2;
                }
                else{
                    result[j] = arr[i];
                    j++;
                }
            }
        }
        for(int i = 0; i < result.length; i++){
            arr[i] = result[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
