package DONE;

public class Maximum_Product {
    public static int adjacentElementsProduct(int[] array) {
        // your code here
        int max = array[0] * array[1];
        for(int i = 1; i < array.length; i++){
            if(i != array.length -1){
                if(array[i] * array[i+1] > max){
                    max = array[i] * array[i+1];
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {4, 12, 3, 1, 5};
        System.out.println(adjacentElementsProduct(nums));
    }
}
