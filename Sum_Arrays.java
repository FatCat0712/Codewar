public class Sum_Arrays {
    public static double sum(double[] numbers){
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static void main(String[] args) {
        double[] arr = {-2.398};
        double ans = sum(arr);
        System.out.println(ans);
    }
}
