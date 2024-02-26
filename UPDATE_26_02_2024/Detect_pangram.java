package UPDATE_26_02_2024;

import java.util.HashMap;

public class Detect_pangram {
    public static boolean check(String sentence){
        String sample = sentence.toLowerCase();
        char[] characters = sample.toCharArray();
        HashMap<Character,Integer> myMap = new HashMap<>();
        for (char character : characters) {
            if(character >= 97 && character <= 122){
                if (myMap.containsKey(character)) {
                    int oldValue = myMap.get(character);
                    myMap.replace(character,oldValue+1);
                } else {
                    myMap.put(character, 1);
                }
            }

        }
        return myMap.size() == 26;

    }
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog.";
        System.out.println(check(s));



    }
}
