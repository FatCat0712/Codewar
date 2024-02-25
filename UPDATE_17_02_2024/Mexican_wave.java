package UPDATE_17_02_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mexican_wave {
    public static String[] wave(String str) {
        // Your code here
        return new String[]{};
    }

    public static void main(String[] args) {
        String s = "hello";
        String[] output = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            String str;
            if(s.charAt(i) != ' '){
                char c = (char)(s.charAt(i) - 32);
                str = s.replace(s.charAt(i),c);
            }
            else{
                continue;
            }
            output[i] = str;
        }
        System.out.println(Arrays.toString(output));
    }
}