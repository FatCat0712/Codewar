package UPDATE_19_02_2024;

public class Smallest_Value {
    public static int findSmallest( final int[] numbers, final String toReturn ) {
        //TODO: Add solution here
        int postion = 0;
        int value = 0;
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
                postion = i;
                value = numbers[i];
            }
        }
        if(toReturn.equals("index")){
            return postion;
        }
        else{
            return value;
        }



    }
}
