package UPDATE_20_02_2024;

import java.util.ArrayList;

public class Convert_String_Camel_case {
    public static void main(String[] args) {
        String s = "The_Stealth_Warrior";
        char[] array = s.toCharArray();
        String result = "";
        for(int i = 0; i < s.length(); i++){
            if(array[i] == '-' || array[i] == '_'){
                array[i] = ' ';
                if(!Character.isUpperCase(array[i+1])){
                    array[i + 1] = (char)(array[i+1]-32);
                }
            }
            result += array[i];
        }
        String[] str = result.split(" ");
        String myString = "";
        for(String string: str){
            myString += string;
        }
        System.out.println(myString);

    }
}
