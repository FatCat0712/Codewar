public class Get_The_Middle_Character {
    public static String getMiddle(String word){
        return word.length() % 2 != 0 ? word.charAt(word.length()/2) +"" : word.substring(word.length()/2-1,word.length()/2+1);
    }
    public static void main(String[] args) {


    }
}
