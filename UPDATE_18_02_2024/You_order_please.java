package UPDATE_18_02_2024;

import java.util.ArrayList;
import java.util.Arrays;

public class You_order_please {
    public static String order(String words) {
        if(words.isEmpty()){
            return "";
        }
        else{
            String[] input = words.split(" ");
            ArrayList<Character> charList = new ArrayList<>();
            for(String str : input){
                char[] characters = str.toCharArray();
                for (int i = 0; i < characters.length; i++) {
                    if(Character.isDigit(characters[i])){
                        charList.add(characters[i]);
                        break;
                    }
                }
            }
            System.out.println(charList);
            char[] num = new char[charList.size()];
            for(int i = 0; i < num.length; i++){
                num[i] = charList.get(i);
            }
            for(int i = 0; i < num.length; i++){
                for(int j = i + 1; j < num.length; j++){
                    if(num[i] > num[j]){
                        char temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }

            String[] output = new String[input.length];
            for(int i = 0; i < input.length; i++){
                int j = 0;
                while(j < num.length){
                    if(input[i].contains(num[j]+"")){
                        output[j] = input[i];
                        break;
                    }
                    j++;
                }
            }
            String result = "";
            for(int i = 0; i < output.length; i++){
                result += output[i] + " ";
            }
            return result.trim();
        }
    }

    public static void main(String[] args) {
        String s = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(order(s));

    }

}
