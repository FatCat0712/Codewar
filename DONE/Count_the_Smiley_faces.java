package DONE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_the_Smiley_faces {
    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        return 0;
    }

    public static void main(String[] args) {
        List<String> smileys = new ArrayList<>(Arrays.asList(";D", ":-(", ":-)", ";~)"));
        int countValid = 0;
        for (String str: smileys){
           char[] c = str.toCharArray();
           if(c.length == 2){
               if((c[0] == ':' || c[0] == ';') && (c[1] == ')' || c[1] == 'D')){
                   countValid++;
               }
           } else if (c.length == 3) {
               if((c[0] == ':' || c[0] == ';') && (c[1] == '-' || c[1] == '~') && (c[2] == ')' || c[2] == 'D')){
                   countValid++;
               }

           }
        }
        System.out.println(countValid);
    }
}
