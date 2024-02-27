package UPDATE_27_02_2024;

public class Binary_Addition {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int sum = a + b;
        String r = "";
        while(sum > 0){
            r = (sum % 2) + r;
            sum = sum /2;
        }
        System.out.println(r);
    }
}
