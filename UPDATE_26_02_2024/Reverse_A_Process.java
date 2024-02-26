package UPDATE_26_02_2024;

public class Reverse_A_Process {
    public static String decode(String r) {
        // your code
        return "";
    }

    public static void main(String[] args) {
        String s = "1544749cdcizljymhdmvvypyjamowl";
        char[] chars = s.toCharArray();
        String strNum = "";
        int lastNumPosition = 0;
        for(int i = 0; i < chars.length; i++){
            if(Character.isDigit(chars[i])){
                strNum += chars[i] ;
                lastNumPosition = i;
            }
        }
        int num = Integer.parseInt(strNum);
        String myString = s.substring(lastNumPosition+1);
        char[] myChars = myString.toCharArray();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String r = "";
        for(int i = 0; i < myChars.length; i++){
            String e = myChars[i] + "";
            int myIndex = alphabet.indexOf(e);
            if(myIndex >= 0){
                int newIndex = myIndex * num % alphabet.length();
                r += alphabet.charAt(newIndex);
            }
        }
        if(r.equals(myString)){
            System.out.println("Impossible to decode");
        }
        else{
            System.out.println(r);
        }

        System.out.println(10 * 6015 % 26);

    }
}
