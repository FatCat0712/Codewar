package UPDATE_23_02_2024;

public class correct_mistakes {
    public static String correct(String string) {
        char[] arr = string.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char c: arr){
            if(c == '5'){
                c = 'S';
            }
            else if(c == '0'){
                c = 'O';
            }
            else  if(c == '1'){
                c = 'I';
            }
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "1F-RUDYARD K1PL1NG";
        System.out.println(correct(s));
    }

}
