package UPDATE_18_02_2024;

public class Vowel_remove {
    public static String shortcut(String input) {
        String result = "";
        char[] characters = input.toCharArray();
        for(int i = 0; i < characters.length; i++){
            if(characters[i] != 'e' && characters[i] != 'a' && characters[i] != 'i' && characters[i] != 'o' && characters[i] != 'u'){
                result += characters[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(shortcut(s));
    }


}
