public class find_the_first_consecutive {
    public static Integer find(final int[] array) {
        int n = array.length;
        if(array[2] != array[1] +1){
            return array[2];
        }
        else if (array[n-1] != array[n - 2] + 1) {
            return array[n-1];
        }
        else{
            for(int i = 3; i <= n - 3; i++){
                if(array[i+1] != array[i] + 1){
                    return array[i+1];
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] num = {-5, -4, -3, -1};
        System.out.println(find(num));
    }
}
