public class nth_smallest_element {
    public static int nthSmallest(final int[] arr, final int n) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        int searchIndex = n - 1;
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == searchIndex){
                result = arr[i];
            }
        }
        return result; // Do your magic!

    }

    public static void main(String[] args) {
        int[] nums = {15,20,7,10,4,3};
        System.out.println(nthSmallest(nums,3));
    }
}
