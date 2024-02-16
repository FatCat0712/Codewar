public class Double_Char {
    public static String doubleChar(String s){
        //enter your code here
        String result = "";
        for(int i = 0; i < s.length(); i++){
           result += s.charAt(i) + "" +s.charAt(i);

        }
        return result;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(doubleChar(s));
    }
}
