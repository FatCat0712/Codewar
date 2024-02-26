package UPDATE_26_02_2024;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        int k = nums1.length - 1;
        while(k >= 0){
            if(n <= 0){
                nums1[k] = nums1[m-1];
                m--;
            }
            else if(m <= 0){
                nums1[k] = nums2[n-1];
                n--;
            }
           else if(nums1[m-1] > nums2[n-1]){
               nums1[k] = nums1[m-1];
               m--;
           }
           else if(nums1[m - 1] <= nums2[n - 1]){
               nums1[k] = nums2[n-1];
               n--;
           }

           k--;
       }
        System.out.println(Arrays.toString(nums1));
    }
}
