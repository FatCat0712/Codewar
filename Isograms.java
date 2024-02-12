public class Isograms {
    public static boolean isIsograms(String str){
        boolean repeat = false;
        String output = str.toLowerCase();
        char[] handle = output.toCharArray();
        int count = 0;

        for(int i = 0; i < handle.length; i++){
            for(int j = i + 1; j < handle.length; j++){
                if(handle[i] == handle[j]){
                    count++;
                }
            }
        }

        if(count == 0){
            repeat = true;
        }
        return repeat;

    }
    public static void main(String[] args) {
        System.out.println(isIsograms("mOose"));
    }
}
