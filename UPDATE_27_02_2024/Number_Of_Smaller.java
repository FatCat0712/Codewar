package UPDATE_27_02_2024;

import java.util.Arrays;

public class Number_Of_Smaller {
    public static void main(String[] args) {
        int[] nums1 = {1,6,9,13,18,18};
        int[] nums2 = {2,3,8,13,15,21,25};
        int i = 0;
        int j = 0;
        int[] output = new int[nums2.length];
        int k = 0;
        while(k < output.length){
            if(i > nums1.length - 1){
                output[k] = nums1.length;
                k++;
            }
            else if(nums2[j] > nums1[i]){
                i++;
            }
            else if(nums2[j] <= nums1[i]){
                output[k] = i;
                j++;
                k++;
            }
        }
        System.out.println(Arrays.toString(output));

    }
}
