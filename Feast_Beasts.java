public class Feast_Beasts {
    public static boolean feast(String beast, String dish) {
        char b1 = beast.charAt(0);
        char b2 = beast.charAt(beast.length()-1);
        char d1 = dish.charAt(0);
        char d2 = dish.charAt(dish.length()-1);

        return b1 == d1 && b2 == d2;
    }

    public static void main(String[] args) {

    }
}
