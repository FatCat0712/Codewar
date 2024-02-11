import java.util.Arrays;

public class Complementary_DNA {
//    A -- T
//    G -- C
    public static void main(String[] args) {
        String sample = "ATTGC";
        char[] ans = sample.toCharArray();
        for(int i = 0; i < ans.length; i++){
            if(ans[i] == 'A'){
                ans[i] = 'T';
            }
            else if(ans[i] == 'T'){
                ans[i] = 'A';
            }
            else if(ans[i] == 'G'){
                ans[i] = 'C';
            }
            else if(ans[i] == 'C'){
                ans[i] = 'G';
            }
        }
        String output = "";
        for (int i = 0; i < ans.length; i++){
            output += ans[i];
        }
        System.out.println(output);

    }
}
