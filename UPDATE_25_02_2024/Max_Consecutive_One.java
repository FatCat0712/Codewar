package UPDATE_25_02_2024;

import java.util.Arrays;

public class Max_Consecutive_One {
    public static void main(String[] args) {
        int[] num = {1,1,0,1,1,1};
        int[] frequency = new int[num.length];
        int count = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] == 1){
                frequency[count]++;
            }
            else{
                count++;
            }

        }
        int max = frequency[0];
        for(int i = 1; i < frequency.length; i++){
            if(frequency[i] > max){
                max = frequency[i];
            }
        }
        System.out.println(Arrays.toString(frequency));
    }
}
