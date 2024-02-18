package UPDATE_18_02_2024;

public class Find_next_square {
    public static long findNextSquare(long sq) {

        return Math.sqrt(sq)== (int)Math.sqrt(sq) ? (long) ((Math.sqrt(sq) + 1) * (Math.sqrt(sq) + 1)) : -1;
    }

    public static void main(String[] args) {
        long num = 121;
        System.out.println(findNextSquare(num));
    }
}
