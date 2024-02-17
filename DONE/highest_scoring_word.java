package DONE;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class highest_scoring_word {
    public static String high(String s) {
        // Your code here...
        if(s.isEmpty()){
            return "";
        }
        else{
            s = s.toLowerCase();
            String[] str = s.split(" ");
            HashMap<Character,Integer> map = new HashMap<>();
            int i = 1;
            int k = 97;
            while ( k <= 122 && i <= 26){
                map.put((char)k,i);
                k++;
                i++;
            }
            ArrayList<Integer> sumOfEachWord = new ArrayList<>();

            for(String chuoi:str){
                int sum = 0;
                char[] charArray = chuoi.toCharArray();
                for(int j = 0; j < charArray.length; j++){
                    sum += map.get(charArray[j]);
                }
                sumOfEachWord.add(sum);
            }

            int max = sumOfEachWord.get(0);
            int result = 0;
            for(int l = 1; l < str.length; l++){
                if(sumOfEachWord.get(l) > max){
                    max = sumOfEachWord.get(l);
                    result = l;
                }
            }
            return str[result];
        }

    }

    public static void main(String[] args) {
        String s = "aa b";
        System.out.println(high(s));

    }
}
