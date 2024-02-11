public class amount_of_points {
    public static int points(String[] games){
        int sum = 0;
        for(String str: games){
            String i = str.charAt(0) + "";
            String j = str.charAt(str.length()-1)+"";
            int n1 = Integer.parseInt(i);
            int n2 = Integer.parseInt(j);
            if(n1 == n2){
                sum += 1;
            }
            else if(n1 > n2){
                sum += 3;
            }

        }
        return sum;
    }
    public static void main(String[] args) {
       String[] games = {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"};
        System.out.println(points(games));

    }
}
