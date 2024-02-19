package UPDATE_19_02_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Simple_Pig_Latin {
    public static String pigIt(String str) {
        StringBuilder result = new StringBuilder();
        String[] myStrings = str.split(" ");
        for(String s: myStrings){
            if(!Pattern.matches("\\p{Punct}",s)){
                char[] characters = s.toCharArray();
                StringBuilder lst = new StringBuilder();
                for(char c: characters){
                    lst.append(c);
                }
                char e = lst.charAt(0);
                lst.deleteCharAt(0);
                lst.append(e);
                lst.append("ay");

                result.append(lst);
                result.append(" ");
            }
            else{
                result.append(s);
            }


        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String sample = "Hello world !";

        System.out.println(pigIt(sample));
    }
}
