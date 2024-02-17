package DONE;

public class you_are_a_square {
    public static boolean isSquare(int n) {
        boolean isFound = false;
        if(n < 0){
            return false;
        }
        else{
            double sqr = Math.sqrt(n);
            if((int)sqr * sqr == n){
                isFound = true;
            }
        }
        return isFound; // fix me!
    }

    public static void main(String[] args) {
        System.out.println(isSquare(239718464));
        System.out.println(Math.sqrt(239718464));
    }
}
