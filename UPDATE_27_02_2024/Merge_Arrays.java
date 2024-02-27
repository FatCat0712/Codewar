package UPDATE_27_02_2024;

import java.util.Arrays;

public class Merge_Arrays {
    public static int[] MergeArray(int[] nums1, int m, int[] nums2, int n){
        int[] output = new int[m + n];
        int k = output.length - 1;
        int i = m - 1;
        int j = n - 1;
        while(k >= 0){
            if(i < 0){
                output[k] = nums2[j];
                j--;
            }
            else if(j < 0){
                output[k] = nums1[i];
                i--;
            }
            else if(nums2[j] > nums1[i]){
                output[k] = nums2[j];
                j--;
            }
            else if(nums2[j] <= nums1[i] ){
                output[k] = nums1[i];
                i--;
            }
            k--;
        }
        return output;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,6,9,13,18,18};
        int[] nums2 = {2,3,8,13,15,21,25};

        System.out.println(Arrays.toString(MergeArray(nums1,nums1.length,nums2,nums2.length)));
    }
}
