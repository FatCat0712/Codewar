package UPDATE_25_02_2024;

import java.util.Stack;

public class Valid_Braces {
    public static boolean isValid(String braces) {
        // Add code here
        char[] arr = braces.toCharArray();
        Stack<Character> myStack = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ')' || arr[i] == ']' || arr[i] == '}'){
                if(myStack.isEmpty()){
                    myStack.push(arr[i]);
                }
                else{
                    char c = myStack.peek();
                    if((c == '(' && arr[i] == ')') || (c == '[' && arr[i] == ']') || (c == '{' && arr[i] == '}')){
                        myStack.pop();
                    }
                    else{
                        myStack.push(arr[i]);
                    }
                }

            }
            else{
                myStack.push(arr[i]);
            }


        }
        return myStack.isEmpty();
    }
    public static void main(String[] args) {
        String braces = "())({}}{()][][";
        System.out.println(isValid(braces));
    }
}
