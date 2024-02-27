package UPDATE_27_02_2024;

public class Find_The_Missing_Letter {
    public static void main(String[] args) {
        char[] arr = {'O','Q','R','S'};
        int i = 0;
        int j = i + 1;
        char missedChar = ' ';
        while(j < arr.length){
            if(arr[i] + 1 != arr[j]){
                int missValued = arr[j] - 1;
                missedChar = (char) missValued;
            }
            i++;
            j++;
        }
        System.out.println(missedChar);
    }
}
