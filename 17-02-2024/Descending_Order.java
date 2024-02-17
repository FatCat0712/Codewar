import java.util.Arrays;

public class Descending_Order {
    public static int sortDesc(final int n) {
        //Your code
        int myNum = n;
        int handleNum = n;
        int countDigit = 0;
        while(handleNum != 0){
            countDigit++;
            handleNum /= 10;
        }
        int[] nums = new int[countDigit];
        int i = 0;
        while (i < nums.length){
            nums[i] = myNum % 10;
            i++;
            myNum /= 10;
        }

        for(int k = 0; k < nums.length; k++){
            for(int l = k + 1; l < nums.length; l++){
                if(nums[l] > nums[k]){
                    int temp = nums[l];
                    nums[l] = nums[k];
                    nums[k] = temp;
                }
            }
        }

        String result = "";
        for(int f = 0; f < nums.length; f++){
            result += nums[f];
        }
        return Integer.parseInt(result);

    }

    public static void main(String[] args) {
        int n = 42145;
        System.out.println(sortDesc(n));




    }
}
