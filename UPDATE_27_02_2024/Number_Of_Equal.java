package UPDATE_27_02_2024;

import java.util.HashMap;

public class Number_Of_Equal {
    public static int NumOfPairs(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i : nums1) {
            if (map1.containsKey(i)) {
                int values = map1.get(i);
                map1.replace(i, ++values);
            } else {
                map1.put(i, 1);
            }
        }
        for (int j : nums2) {
            if (map2.containsKey(j)) {
                int values = map2.get(j);
                map2.replace(j, ++values);
            } else {
                map2.put(j, 1);
            }
        }
        int count = 0;
        for(int k = 0; k < nums2.length; k++){
            if(nums2[k] == nums1[k]){
                count += map1.get(nums1[k]) * map2.get(nums2[k]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,3,3,3,5,8,8};
        int[] nums2 = {1,3,3,4,5,5,5};
        System.out.println(NumOfPairs(nums1,nums2));

    }
}
