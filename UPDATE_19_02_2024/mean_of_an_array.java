package UPDATE_19_02_2024;

public class mean_of_an_array {
    public static int getAverage(int[] marks){
        double result = 0;
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        result = Math.floor((double)sum/marks.length);
        return (int)result;
    }
    public static void main(String[] args) {
            int[] num = {1,2,3,4,5};
        System.out.println(getAverage(num));
    }
}
