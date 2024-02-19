package UPDATE_19_02_2024;

import java.util.Arrays;

public class Count_the_monkeys {
    public static int[] monkeyCount(final int n){
        int[] num = new int[n];
        for(int  i = 0; i < n; i++){
            num[i] = i + 1;
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(monkeyCount(n)));
    }
}
