package DONE;

public class Remove_First_And_Last_Character {
    public static String remove(String str){
        char[] characters = str.toCharArray();
        String output = "";
        for(int i = 1; i < characters.length -1; i++){
            output += characters[i];
        }
        return output;
    }
    public static void main(String[] args) {
        String sample = "person";
        String output = remove(sample);
        System.out.println(output);

    }
}
