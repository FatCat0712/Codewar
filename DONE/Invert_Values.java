package DONE;

public class Invert_Values {
    public static int[] invert(int[] array){
        if(array.length != 0){
            for(int i = 0; i < array.length; i++){
                    array[i] *= -1;
            }
        }
        return array;
    }
    public static void main(String[] args) {

    }
}
