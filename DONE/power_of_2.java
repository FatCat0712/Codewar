package DONE;

import java.util.Arrays;

public class power_of_2 {
    public static long[] powersOfTwo(int n){
        long[] result = new long[n+1];
        if(n == 0){
            return new long[]{1};
        }
        else{
           int i = 0;
           while (i < result.length){
               result[i] = (long)Math.pow(2,i);
               i++;
           }
        }

        //TODO: Have fun
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.toString(powersOfTwo(n)));
        String s = "S";
        String output = "";
        output += s.repeat(4);
        System.out.println(output);

    }
}
