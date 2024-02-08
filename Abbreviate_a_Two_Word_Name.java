import java.util.ArrayList;
import java.util.Arrays;

public class Abbreviate_a_Two_Word_Name {
    public static String abbrevName(String name){
        String result = "";
        String[] a = name.split(" ");
        for(int i = 0; i < a.length;i++){
            if(a[i].length() == 1){
                if(i == a.length - 1){
                    a[i] = a[i].toUpperCase();
                    result += a[i].charAt(0);
                }
                else{
                    a[i] = a[i].toUpperCase();
                    result += a[i].charAt(0);
                    result += ".";
                }
            }
            else if(a[i].length() != 1){
                if(i == a.length - 1){
                    a[i] = a[i].toUpperCase();
                    result += a[i].charAt(0);
                }
                else{
                    a[i] = a[i].toUpperCase();
                    result += a[i].charAt(0);
                    result += ".";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String name = "mai son hai";
        String result = abbrevName(name);
        System.out.println(result);
    }
}
