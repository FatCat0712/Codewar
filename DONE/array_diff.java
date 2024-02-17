package DONE;

import java.util.Arrays;

public class array_diff {
    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        if(a.length == 0) {
            return new int[]{};
        }
        else if (b.length == 0) {
            return a;
        }
        else{
            int[] frequency = new int[a.length + b.length];
            String output = "";
            for (int i : a) {
                frequency[i]++;
            }
            for (int j : b) {
                frequency[j]++;
            }
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] == 1) {
                    output += i + " ";
                }
            }

            String[] characters = output.split(" ");
            int[] result = new int[characters.length];
            for(int k = 0; k < characters.length; k++) {
                result[k] = Integer.parseInt(characters[k]);
            }
            return result;
        }

    }

    public static void main(String[] args) {
        int[] a = {1,2,2};
        int[] b = {1};
//        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(arrayDiff(a,b)));

    }
}
