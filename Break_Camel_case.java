import java.util.Arrays;

public class Break_Camel_case {
    public static void main(String[] args) {
        String s = "camelCasing";
        char[] characters = s.toCharArray();
        String result = "";
        for(int i = 0; i < characters.length; i++){
            if(characters[i] >= 'A' &&  characters[i] <= 'Z'){
                result += " " +characters[i];
                i++;
            }
            result += characters[i] +"";
        }
        System.out.println(result);



    }
}
