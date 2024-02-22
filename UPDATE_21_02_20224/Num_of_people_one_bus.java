package UPDATE_21_02_20224;

import java.util.ArrayList;
import java.util.Arrays;

public class Num_of_people_one_bus {
    public static void main(String[] args) {
        ArrayList<int[]>list = new ArrayList<>();
        list.add(new int[]{10,0});
        list.add(new int[]{3,5});
        list.add(new int[]{2,5});
        int in = 0;
        int out = 0;
        for(int[] arr: list){
                in += arr[0];
                out += arr[arr.length-1];

        }
        System.out.println(in+ " " + out);
    }
}
