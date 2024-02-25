package UPDATE_25_02_2024;

public class Reverse_words {
    public static String reverseWords(final String original)
    {
        // Have at it
        String sample = original;
        char[] isSpace = sample.toCharArray();
        int count = 0;
        for(int i = 0; i < isSpace.length; i++){
            if(Character.isSpaceChar(isSpace[i])){
                count++;
            }
        }
        if(count == isSpace.length){
            return sample;
        }
        else{
            String[] arr = sample.split(" ");
            String result = "";
            for(int i = 0; i < arr.length; i++){
                char[] chars = arr[i].toCharArray();
                int j = chars.length - 1;
                String element = "";
                while(j >= 0){
                    element += chars[j];
                    j--;
                }
                result += element + " ";
            }
            return result.trim();
        }

    }
    public static void main(String[] args) {
        String s = "This is an example!";

    }


}
