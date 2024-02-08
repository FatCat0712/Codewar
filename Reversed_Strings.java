public class Reversed_Strings {
    public static String solution(String str){
        char[] characters = str.toCharArray();
        String output = "";
        for(int i = characters.length - 1; i >= 0; i--){
            output+=characters[i];
        }
        return output;
    }
    public static void main(String[] args) {
        String sample = "word";
        String output = solution(sample);
        System.out.println(output);
    }
}
