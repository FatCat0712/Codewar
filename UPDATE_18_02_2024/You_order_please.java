package UPDATE_18_02_2024;

import java.util.Arrays;

public class You_order_please {
//    public static String order(String words) {
//
//    }

    public static void main(String[] args) {
        String s = "4of Fo1r pe6ople g3ood th5e the2";
        String[] input = s.split(" ");
        char[] num = new char[input.length];
        for(String str : input){
            char[] characters = str.toCharArray();
            for (int i = 0; i < characters.length; i++) {
                if(Character.isDigit(characters[i])){
                    num[i] = characters[i];
                    break;
                }
            }
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

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(output));

    }

}
