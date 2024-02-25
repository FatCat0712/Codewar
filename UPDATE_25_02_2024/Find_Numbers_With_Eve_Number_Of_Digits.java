package UPDATE_25_02_2024;

public class Find_Numbers_With_Eve_Number_Of_Digits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        int countEven = 0;
        for(int number:nums){
            int count = 0;
            while(number > 0){
                number /= 10;
                count++;
            }
            if(count % 2 == 0){
                countEven++;
            }
        }
        System.out.println(countEven);
    }
}
