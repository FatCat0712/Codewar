import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ones_And_Zeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        int pow = 0;
        for(int i = 0; i < binary.size(); i++){
            if(binary.get(i) == 1){
                pow = binary.size() - 1 - i;
                result += Math.pow(2,pow);

            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,0,1,1));
        System.out.println(ConvertBinaryArrayToInt(arr));
    }
}
