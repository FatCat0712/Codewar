package UPDATE_19_02_2024;

public class Jaden_Casing_Strings {
    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if(phrase == null || phrase == ""){
            return null;
        }
        else{
            String[] sample = phrase.split(" ");
            StringBuilder output = new StringBuilder();
            for(String str: sample){
                str = str.toLowerCase();
                output.append(str.replace(str.charAt(0), (char)(str.charAt(0) - 32))+" ");
            }
            return output.toString().trim();
        }

    }

    public static void main(String[] args) {
        String s = "How can mirrors be real if our eyes aren't real";
        System.out.println(toJadenCase(s));
    }
}
