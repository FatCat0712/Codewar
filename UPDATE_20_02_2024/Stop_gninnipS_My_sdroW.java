package UPDATE_20_02_2024;

import java.util.Arrays;

public class Stop_gninnipS_My_sdroW {
    public static void main(String[] args) {
        String s = "This is another test";
        String[] str = s.split(" ");
        String[] output = new String[str.length];
        for(int i = 0; i < str.length; i++){
            if(str[i].length() >= 5){
                StringBuilder result = new StringBuilder();
                char[] array = str[i].toCharArray();
                for(int j = array.length - 1; j >= 0; j--){
                    result.append(array[j]);
                }
                output[i] = result.toString();
            }
            else{
                output[i] = str[i];
            }
        }
        String myOutput = "";
       for (int i = 0; i < output.length; i++){
           myOutput += output[i] + " ";
       }
        System.out.println(myOutput.trim());
    }
}
