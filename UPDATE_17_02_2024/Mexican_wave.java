package UPDATE_17_02_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mexican_wave {
    public static String[] wave(String str) {
        // Your code here
        return new String[] {};
    }

    public static void main(String[] args) {
        String s = "two words";
        char[] characters = s.toCharArray();
        int i = 0;
        List<String> myList = new ArrayList<>();
        String str = "";
        while (i < characters.length){
            if(!Character.isWhitespace(characters[i])){
                characters[i] = (char) (characters[i] - 32);
            }
            i++;

        }
        System.out.println(Arrays.toString(characters));

    }
}
