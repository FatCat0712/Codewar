package UPDATE_19_02_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enough_Is_Enough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if(elements.length == 0){
            return new int[]{};
        }
        else{
            List<Integer> myList = new ArrayList<>();
            for (int element : elements) {
                myList.add(element);
            }
            int[] frequency = new int[50];
            for(int i = 0; i < myList.size(); i++){
                int value = myList.get(i);
                frequency[value]++;
                if(frequency[value] > maxOccurrences){
                    myList.set(i,null);
                }
            }
            List<Integer> result = new ArrayList<>();
            for(int i = 0; i < myList.size(); i++){
                if(myList.get(i) != null){
                    result.add(myList.get(i));
                }
            }
            int[] output = new int[result.size()];
            for(int i = 0; i < output.length; i++){
                output[i] = result.get(i);
            }
            return output;
        }

    }
    public static void main(String[] args) {
        int[] elements = { 1, 1, 3, 3, 7, 2, 2, 2, 2 };
        System.out.println(Arrays.toString(deleteNth(elements,3)));


    }

}
