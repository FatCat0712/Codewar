package UPDATE_17_02_2024;

import java.util.Arrays;

public class Mexican_wave {
    public static String[] wave(String str) {
        // Your code here
        return new String[] {};
    }

    public static void main(String[] args) {
        String s = "two words";
        String[] myStr = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                myStr[i] = s.replace(s.charAt(i),(char)(s.charAt(i) - 32));
            }
        }
        System.out.println(Arrays.toString(myStr));

    }
}
