package UPDATE_19_02_2024;

public class reversed_words {
    public static String reverseWords(String str){
        //write your code here...
        String[] mylist = str.split(" ");
        StringBuilder output = new StringBuilder();
        for(int i = mylist.length - 1; i >= 0; i--){
            output.append(mylist[i]+" ");
        }
        return output.toString().trim();
    }

    public static void main(String[] args) {
        String s = "The greatest victory is that which requires no battle";
        System.out.println(reverseWords(s));
    }
}
