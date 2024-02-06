import java.util.Arrays;

public class Count_Of_Positive_Negative {
    public static int[] countPositiveSumNegatives(int[] input){

        if(input == null || input.length  < 1){
            int[] emptyArrays = {};
            return emptyArrays;
        }
        int[] result = new int[2];
        int oCount = 0;
        int sum = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                oCount+=1;
            }
            else{
                sum+=input[i];
            }
        }
        result[0] = oCount;
        result[1] = sum;
        return result;
    }
    public static void main(String[] args) {
        int[] result;
        int[] sample = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] sample2 = null;
        result = countPositiveSumNegatives(sample);
        //result = countPositiveSumNegatives(sample2);
        System.out.println(Arrays.toString(result));
    }
}
