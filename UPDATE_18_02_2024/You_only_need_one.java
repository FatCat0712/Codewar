package UPDATE_18_02_2024;

public class You_only_need_one {
    public static boolean check(Object[] a, Object x) {
        // Your code here
        for(int i = 0; i < a.length; i++){
            if(x.equals(a[i])){
                return true;
            }
        }
        return false;
    }
}
