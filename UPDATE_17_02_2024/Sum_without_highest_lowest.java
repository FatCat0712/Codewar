package UPDATE_17_02_2024;

import java.util.Arrays;

public class Sum_without_highest_lowest {
    public static int sum(int[] numbers)
    {
        int sum = 0;
        if(numbers != null)
        {
            if (numbers.length == 0 ) {
                sum = 0;
            }
            else {
                for (int i = 0; i < numbers.length - 1; i++) {
                    for (int j = numbers.length - 1; j > i; j--) {
                        if (numbers[j] < numbers[j - 1]) {
                            int temp = numbers[j];
                            numbers[j] = numbers[j - 1];
                            numbers[j - 1] = temp;
                        }
                    }
                }
            }
            for(int i = 1; i <= numbers.length - 2; i++){
                sum += numbers[i];
            }

        }
        return sum;



    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 11, 2, 3 };
        System.out.println(sum(nums));
    }
}