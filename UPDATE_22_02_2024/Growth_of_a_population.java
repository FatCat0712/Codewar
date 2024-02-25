package UPDATE_22_02_2024;

public class Growth_of_a_population {
    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int count = 0;
        double myPercent = percent/100;
        int percentToNumber = (int) (p0 * myPercent);
        int result = (int) (p0 + percentToNumber + aug);
        while(result < p){
            count++;
            p0 = result;
            percentToNumber = (int)(p0 * myPercent);
            result = p0 + percentToNumber + aug;

        }
        return count + 1;
    }
    public static void main(String[] args) {
        System.out.println(nbYear(1000,2,50,1200));
    }
}
