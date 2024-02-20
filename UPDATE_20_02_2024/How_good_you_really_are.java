package UPDATE_20_02_2024;

public class How_good_you_really_are {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        double average;
        int sum = 0;
        for(int i: classPoints){
            sum += i;
        }
        sum += yourPoints;
        average = (double) sum/ (classPoints.length+ 1);
        return yourPoints > average;
    }
}
