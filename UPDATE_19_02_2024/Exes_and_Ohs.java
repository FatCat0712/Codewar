package UPDATE_19_02_2024;

public class Exes_and_Ohs {
    public static boolean getXO (String str) {
        // Good Luck!!
        String output = str.toLowerCase();
        char[] arr = output.toCharArray();
        int countX = 0;
        int countO = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'x'){
                countX++;
            }
            else if(arr[i] == 'o'){
                countO++;
            }
        }
        return  countX == countO;
    }

    public static void main(String[] args) {
        String s = "zpzpzpp";
        System.out.println(getXO(s));
    }
}
