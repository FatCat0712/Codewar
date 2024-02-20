package UPDATE_20_02_2024;

public class Credit_Card_Mask {
    public static void main(String[] args) {
        String s = "Skippy";

        char[] array = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            if(i < array.length - 4){
                array[i] = '#';
            }
            result.append(array[i]);
        }
        System.out.println(result.toString());
    }
}
