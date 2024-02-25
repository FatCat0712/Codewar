package UPDATE_22_02_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort_And_Star {
    public static void main(String[] args) {
        String[] sample = {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"};
        ArrayList<String> myStringList = new ArrayList<>();
        for(String s: sample){
            myStringList.add(s);
        }
        Collections.sort(myStringList);
        String handle = myStringList.get(0);
        char[] array = handle.toCharArray();
        String result = "";
        for(int i = 0; i < array.length; i++){
           if(i == array.length - 1){
               result += array[i];
           }
           else{
               result += array[i] + "***";
           }
        }
        System.out.println(result);


    }
}
