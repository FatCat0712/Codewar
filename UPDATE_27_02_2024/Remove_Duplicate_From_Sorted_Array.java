package UPDATE_27_02_2024;

import java.util.Arrays;

public class Remove_Duplicate_From_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] != nums[k]){
                k++;
                nums[k] = nums[i];
            }
            i++;
        }
        return k + 1;
    }
    public static void main(String[] args) {
        int[] nums =  {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
