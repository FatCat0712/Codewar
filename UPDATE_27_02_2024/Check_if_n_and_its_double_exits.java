package UPDATE_27_02_2024;

public class Check_if_n_and_its_double_exits {
    public static boolean checkIfExist(int[] arr) {
        for (int k : arr) {
            for (int i = 1; i < arr.length; i++) {
                if (k == arr[i] * 2 || arr[i] == k * 2) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,14,11};
        System.out.println(checkIfExist(arr));
    }
}
