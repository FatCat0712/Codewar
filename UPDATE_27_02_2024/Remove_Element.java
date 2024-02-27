package UPDATE_27_02_2024;

import java.util.Arrays;

public class Remove_Element {
    public static int removeElement(int[] nums,int value){
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != value){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));
    }
}
