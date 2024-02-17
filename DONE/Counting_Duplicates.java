package DONE;

public class Counting_Duplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        int count = 0;
        String sample = text.toLowerCase();
        int[] frequency = new int[123];
        for(int i = 0; i < sample.length(); i++){
            char c = sample.charAt(i);
            frequency[c]++;
        }
        for (int j : frequency) {
            if (j > 1) {
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        String s = "Indivisibilities";
        System.out.println(duplicateCount(s));
    }
}
