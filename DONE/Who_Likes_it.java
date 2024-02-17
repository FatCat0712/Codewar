package DONE;

public class Who_Likes_it {
    public static String whoLikesIt(String[] names) {
        int n = names.length;
        String result = "";
        if(n == 0)
            result = "no one likes this";
        else if (n == 1) {
            result = names[0]+" likes this";
        }
        else if(n == 2) {
            result = names[0]+" and "+names[1]+" like this";
        }
        else if(n == 3) {
            result = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else if (n==4) {
            result = names[0]+" "+names[1]+" "+"and "+(names.length - 2)+" others like this";
        }
        return result;
    }
    public static void main(String[] args) {
        String[] names = {"Max", "John", "Mark"};
        System.out.println(whoLikesIt(names));





    }
}
