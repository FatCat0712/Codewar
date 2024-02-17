package DONE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Remove_minium {
    public static int[] removeSmallest(int[] numbers) {
        if(numbers.length == 0){
            return new int[]{};
        }
        else{
            ArrayList<Integer> handle = new ArrayList<>();
            for(int i = 0; i < numbers.length; i++){
                handle.add(i,numbers[i]);
            }
            Collections.sort(handle);
            int min = handle.get(0);
            ArrayList<Integer> handleRest = new ArrayList<>();
            for(int i = 0; i < numbers.length; i++){
                handleRest.add(i,numbers[i]);
            }
            handleRest.remove(handleRest.indexOf(min));
            int[] result = new int[handleRest.size()];
            for(int i = 0; i < result.length; i++){
                result[i] = handleRest.get(i);
            }
            return result;
        }



    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 1, 4};
        System.out.println(Arrays.toString(removeSmallest(nums)));


    }
}
