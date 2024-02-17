package DONE;

public class remove_string_spaces {
    public static String noSpace(final String x){
        String result = "";
        String[] output = x.split(" ");
        for (String s : output) {
            result += s;
        }
        return result;
    }
}
