package UPDATE_17_02_2024;

import java.sql.Array;
import java.util.Arrays;

public class Square_Evey_Digit {
    public static int squareDigits(int n) {
        if(n == 0){
            return 0;
        }
        else{
            int handleNum = n;
            int countNum = 0;
            while (n != 0){
                countNum++;
                n /= 10;
            }
            int[] result = new int[countNum];
            int i = 0;
            while (i < result.length){
                result[i] = handleNum % 10;
                handleNum /= 10;
                i++;
            }
            String str = "";
            for(int j = result.length -1 ; j >= 0; j--){
                str += result[j] * result[j];
            }
            return Integer.parseInt(str);
        }



    }

    public static void main(String[] args) {
        int n = 9119;
        System.out.println(squareDigits(n));

    }
}
