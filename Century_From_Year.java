import java.util.Scanner;

public class Century_From_Year {
    public static int century(int number){
        int ans = 0;
        if(number >= 1 && number <= 100){
            ans = 1;
        }
        else if(number > 100 && number % 100 == 0){
            ans = number / 100;
        }
        else{
            ans = (number / 100) + 1;
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Century: "+ century(n));
        boolean a = true;
        System.out.println(String.valueOf(a));

    }
}
