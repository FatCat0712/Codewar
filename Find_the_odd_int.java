import java.util.HashMap;

public class Find_the_odd_int {
    public static int findIt(int[] a) {
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                int oldValue = map.get(num);
                map.replace(num, oldValue + 1);
            }
            else{
                map.put(num, 1);
            }

        }
        for(int num: nums){
            if(map.get(num) % 2 != 0){
                System.out.println(num);
                break;
            }
        }




    }


}
