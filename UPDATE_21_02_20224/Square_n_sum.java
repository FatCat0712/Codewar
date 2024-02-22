package UPDATE_21_02_20224;

public class Square_n_sum {
    public static int squareSum(int[] n)
    {
        //Your Code
        int sum = 0;
        for (int j : n) {
            sum += j * j;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] num = {1,2,2};
        System.out.println(squareSum(num));
    }
}
