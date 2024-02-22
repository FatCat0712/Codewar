package UPDATE_21_02_20224;

public class Vowel_Count {
    public static int getCount(String str) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abracadabra";
        System.out.println(getCount(s));
    }
}
