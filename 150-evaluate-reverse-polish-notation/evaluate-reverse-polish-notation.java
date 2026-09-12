import java.util.*;

class Solution {
    public int evalRPN(String[] arr) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+") || arr[i].equals("-") ||
                arr[i].equals("*") || arr[i].equals("/")) {

                int b = s.pop();
                int a = s.pop();

                int d = operation(a, b, arr[i]);

                s.push(d);

            } else {
                int num = Integer.parseInt(arr[i]);
                s.push(num);
            }
        }
        return s.pop();
    }
    public static int operation(int a, int b, String op) {

        if (op.equals("+")) {
            return a + b;
        } 
        else if (op.equals("-")) {
            return a - b;
        } 
        else if (op.equals("*")) {
            return a * b;
        } 
        else {
            return a / b;
        }
    }
}