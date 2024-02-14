import java.util.Arrays;

public class Break_Camel_case {
    public static void main(String[] args) {
        String s = "camelCasing";
        int n = s.length();
        StringBuilder result = new StringBuilder();
        char[] input = s.toCharArray();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                n++;
                char[] characters = Arrays.copyOf(input,n);

                for(int j = n - 1; j >= i; j--){
                    characters[i + 1] = characters[i];
                }
                characters[i] = ' ';
                result.append(Arrays.toString(characters));
            }
        }
        System.out.println(result);


    }
}
