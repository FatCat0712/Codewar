package UPDATE_26_02_2024;

public class Count_the_divisors {
    public static void main(String[] args) {
        int n = 30;
        int count = 0;
        for(int i = 1; i <= 30; i++){
            if(n % i == 0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
