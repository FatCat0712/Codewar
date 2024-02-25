package UPDATE_23_02_2024;

import java.util.ArrayList;
import java.util.List;

public class Testing_1_2_3 {
    public static List<String> number(List<String> lines) {
        if(lines.isEmpty()){
            return new ArrayList<>();
        }
        else{
            List<String> result = new ArrayList<>();
            int i = 0;
            int j = 1;
            while (i < lines.size()){
                String s = j +": "+ lines.get(i);
                result.add(s);
                i++;
                j++;
            }
            return result;
        }


    }
    public static void main(String[] args) {
        List<String> lines = List.of("","","");
        System.out.println(number(lines));

    }
}
