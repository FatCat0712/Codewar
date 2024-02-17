package DONE;

import java.util.Arrays;

public class Code_years_dog_years {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!
        int[] result = new int[3];
        result[0] = humanYears;
        for(int i = 1; i <= humanYears; i++ ){
            if(i == 1){
                result[1] += 15;
                result[2] += 15;
            }
            else if(i == 2){
                result[1] += 9;
                result[2] += 9;
            }
            else{
                result[1] += 4;
                result[2] += 5;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }
}
