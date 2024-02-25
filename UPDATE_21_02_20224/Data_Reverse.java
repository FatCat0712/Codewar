package UPDATE_21_02_20224;

import java.util.ArrayList;
import java.util.Arrays;

public class Data_Reverse {
    public static int[] DataReverse(int[] data) {
        String[] bytes = new String[data.length/8];
        int j = 0;
        for(int i = 0; i < bytes.length; i++){
            String stringElement = "";
            int count = 0;
            while (count < 8){
                stringElement += data[j];
                count++;
                j++;
            }
            bytes[i] = stringElement;
        }
        String[] reverseArray = new String[data.length/8];
        for(int i = bytes.length - 1; i >= 0; i--){
            reverseArray[bytes.length - 1 - i] = bytes[i];
        }
        String result = "";
        for(int i = 0; i < reverseArray.length; i++){
            result += reverseArray[i];
        }
        char[] array = result.toCharArray();
        int[] output = new int[array.length];
        for(int k = 0; k < output.length; k++){
            String e = "";
            e += array[k];
            output[k] = Integer.parseInt(e);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] data = {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(DataReverse(data)));



    }
}
