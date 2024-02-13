public class shortest_word {
    public static int findShort(String s) {
        String[] sample = s.split(" ");
        int minLength = sample[0].length();
        for(int i = 0; i < sample.length; i++){
            if(sample[i].length() < minLength){
                minLength = sample[i].length();
            }
        }
        return minLength;
    }
}
