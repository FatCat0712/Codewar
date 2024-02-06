public class Sentence_Smash {
    public static String smash(String[] words){
        String result = "";
        for(int i = 0; i < words.length; i++){
            words[i]+=" ";
            result += words[i];
        }
        result = result.trim();
        return result;
    }
    public static void main(String[] args) {
        String[] sample = new String[]{"hello", "world", "this", "is", "great"};

        String result = smash(sample);
        System.out.println(result);
    }
}
