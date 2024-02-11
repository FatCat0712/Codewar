public class Sum_of_the_first_nth_term {
    public static String seriesSum(int n){
        double sum = 0;
        int index = 0;
        int tu = 1;
        int mau = 1;
        while(index < n){
            sum += (double) tu / mau;
            mau += 3;
            index++;
        }
        return String.format("%.2f",sum);
    }
    public static void main(String[] args) {
        System.out.println(seriesSum(15));
    }
}
