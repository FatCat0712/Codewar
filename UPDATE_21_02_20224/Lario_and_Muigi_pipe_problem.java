package UPDATE_21_02_20224;

import java.util.Arrays;

public class Lario_and_Muigi_pipe_problem {
    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        int[] result = new int[numbers[numbers.length-1]-numbers[0]+1];
        int k = numbers[0];
        for(int i = 0; i < result.length;i++){
            result[i] = k;
            k++;
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] num = {6,9};
        System.out.println(Arrays.toString(pipeFix(num)));
    }
}
