public class Duplicate_Encoder {
    public static String encode(String words){
        String sample = words.toLowerCase();
        char[] arr = sample.toCharArray();
        int[] frequency = new int[123];
        for (char c : arr) {
            frequency[(int) c]++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            char c = arr[i];
            if(frequency[(int)c] == 1){
                arr[i] = '(';
            }
            else if(frequency[(int)c] > 1){
                arr[i] = ')';
            }
            result.append(arr[i]);
        }
        return result.toString();
    }
    public static String duplicate_encode(String word) {
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
    public static void main(String[] args) {
            String s = "Success";
            System.out.println(duplicate_encode(s));





    }
}
