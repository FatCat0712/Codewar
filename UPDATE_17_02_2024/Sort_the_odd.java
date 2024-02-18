import java.util.Arrays;

public class Sort_the_odd {
    public static int[] sortArray(int[] array) {
        int countOdd = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                countOdd++;
            }
        }
        int[] oddArray = new int[countOdd];
        int i = 0;
        int j = 0;
        while (i < array.length){
            if(array[i] % 2 != 0){
                oddArray[j] = array[i];
                array[i] = -1;
                j++;

            }
            i++;
        }
        for(int k = 0; k < oddArray.length - 1; k++) {
            for (int l = oddArray.length - 1; l > k; l--) {
                if (oddArray[l] < oddArray[l - 1]) {
                    int temp = oddArray[l];
                    oddArray[l] = oddArray[l - 1];
                    oddArray[l - 1] = temp;
                }
            }
        }
        int h = 0;
        int m = 0;
        while(h < array.length){
            if(array[h] == -1){
                array[h] = oddArray[m];
                m++;
            }
            h++;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
