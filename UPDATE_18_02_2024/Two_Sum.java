package UPDATE_18_02_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two_Sum {
    public static int[] twoSum(int[] numbers, int target) {
        List<Integer> result = new ArrayList<>();
        int n = numbers.length;;
        boolean stop = false;
        for (int i = 0; i < n; i++){
            for(int j = i + 1;j < n; j++){
                if(numbers[i] + numbers[j] == target){
                    result.add(i);
                    result.add(j);
                    stop = true;
                    break;
                }
            }
            if(stop){
                break;
            }
        }
        int[] ouput = new int[result.size()];
        for(int k = 0; k < ouput.length; k++){
            ouput[k] = result.get(k);
        }
        return ouput;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(twoSum(num,7)));
    }

}
