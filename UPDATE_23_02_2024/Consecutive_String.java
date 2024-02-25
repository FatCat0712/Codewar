package UPDATE_23_02_2024;

import java.util.ArrayList;
import java.util.Collections;

public class Consecutive_String {
    public static String longestConsec(String[] s, int k) {
        // your code
        String result = "";
        if(s.length == 0 || k < 0 || k > s.length){
            return "";
        }
        else if(k > 1){
            ArrayList<Integer> myLength = new ArrayList<>();
            for(int i = 0; i < s.length; i++){
                if(i != s.length - 1){
                    String myStr = "";
                    int j = 0;
                    int l = i;
                    while(j < k){
                        if(l < s.length){
                            myStr += s[l];
                        }
                        l++;
                        j++;
                    }
                    myLength.add(myStr.length());
                }

            }
            Collections.sort(myLength);
            int maxLength = myLength.get(myLength.size()-1);

            for(int i = 0; i < s.length; i++){
                if(i != s.length - 1){
                    String myStr = "";
                    int j = 0;
                    int l = i;
                    while(j < k){
                        myStr += s[l];
                        l++;
                        j++;
                    }
                    if(myStr.length() == maxLength){
                        result += myStr;
                        break;
                    }
                }

            }
        }
        else if(k == 1){
            int maxLength = s[0].length();
            for(int i = 0; i < s.length; i++){
                if(s[i].length() > maxLength){
                    maxLength = s[i].length();
                }
            }
            for(int i = 0; i < s.length; i++){
                if(s[i].length() == maxLength){
                    result += s[i];
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] s = {};
        System.out.println(longestConsec(s,1));
    }
}
