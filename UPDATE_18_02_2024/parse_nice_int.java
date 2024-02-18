package UPDATE_18_02_2024;

public class parse_nice_int {
    public static int howOld(final String herOld) {
        String[] s = herOld.split(" ");
        return Integer.parseInt(s[0]);

    }

    public static void main(String[] args) {
        String s = "5 years olds";
        System.out.println(howOld(s));
    }
}
