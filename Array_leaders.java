import java.util.*;

public class Array_leaders {
    public static List arrayLeaders(int[] numbers)
    {
        int n = numbers.length;
        List<Integer> arr = new ArrayList<>();
        if(numbers[n - 1] >= 0){
            arr.add(numbers[n-1]);
        }
        int i = n - 1;
        while (i >= 0){
            if(numbers[i] > arr.get(arr.size()-1)){
                arr.add(numbers[i]);
            }
            i--;
        }
        // Đảo ngược list
        Integer[] output = new Integer[arr.size()];
        for(int k = 0; k < output.length; k++){
            output[k] = arr.get(arr.size() - k - 1);
        }
        arr = Arrays.asList(output);
        return arr; // Do your magic!
    }

    public static void main(String[] args) {
        int[] nums = {-36,-12,-27};
        System.out.println(arrayLeaders(nums).toString());
    }
}
