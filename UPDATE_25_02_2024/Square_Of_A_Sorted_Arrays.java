package UPDATE_25_02_2024;

import java.util.Arrays;

public class Square_Of_A_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] newNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
            newNums[i] = nums[i];
        }
        for(int i = 0; i < newNums.length; i++){
            for(int j = i + 1; j < newNums.length; j++){
                if(newNums[i] > newNums[j]){
                    int temp = newNums[i];
                    newNums[i] = newNums[j];
                    newNums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(newNums));

    }
}
