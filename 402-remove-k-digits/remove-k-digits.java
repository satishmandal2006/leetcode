import java.util.*;
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!s.isEmpty() && k > 0 && s.peek() > ch){
                s.pop();
                k--;
            }
            s.push(ch);
            
        }
        //convert stack to string builder
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            if(k > 0){
                s.pop();
                k--;
            }else{
                sb.insert(0,s.pop());
            }
        }
        while(sb.length() > 0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        if(sb.length() == 0){
            return "0";
        }else{
            return sb.toString();
        }

    }
}