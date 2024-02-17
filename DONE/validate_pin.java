package DONE;

public class validate_pin {
    public static boolean validatePin(String pin) {
        int count = 0;
        boolean check = false;
        if(pin.length() == 4 || pin.length() == 6){
           char[] checkChar = pin.toCharArray();
           for(char c : checkChar){
               if(Character.isDigit(c)){
                   count++;
               }
           }
        }
        if(count == pin.length() && !pin.isEmpty())
            return true;
        return check;
    }

    public static void main(String[] args) {
        System.out.println(validatePin(""));

    }
}
