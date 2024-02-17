package DONE;

import java.util.Scanner;

public class Transporation_on_vacation {
    public static int rentalCarCost(int d){
        int rentalCarCost = 0;
        if(d >= 1){
            if(d < 3){
                rentalCarCost = 40 * d;
            }
            if(d >= 7){
                rentalCarCost = 40 * d - 50;
            }
            else if(d >= 3){
                rentalCarCost = 40 * d - 20;
            }

        }
        return rentalCarCost;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int rentalCarCost = rentalCarCost(d);
        System.out.println(rentalCarCost);
    }
}
