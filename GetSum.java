public class GetSum {
    public static int GetSum(int a, int b){
        int sum = 0;
        if(a == b)
            return a;
        else if(a > b){
            for (int i = b; i <= a; i++){
                sum += i;
            }
        }
        else{
            for (int i = a; i <= b; i++){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(GetSum(-1,2));
    }
}
