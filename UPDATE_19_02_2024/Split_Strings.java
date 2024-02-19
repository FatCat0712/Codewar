package UPDATE_19_02_2024;

import java.util.Arrays;

public class Split_Strings {
    public static String[] solution(String s) {
        //Write your code here
        return null;
    }

    public static void main(String[] args) {
        String s = "abcdef";
        int n = s.length();
        if(n % 2 != 0){
            n += 1;
            s += "_";
        }
        String[] str = new String[n/2];
        int i = 0;
        int j = 0;
        while (j < n){
            str[i] = s.substring(j,j+2);
            i++;
            j += 2;
        }
        System.out.println(Arrays.toString(str));
    }
}
