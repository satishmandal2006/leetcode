class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s1.isEmpty()){
                s1.push(ch);
            }
            else if(ch==s1.peek()){
                s1.pop();
            }else{
                s1.push(ch);
            }
        }

        StringBuilder ans=new StringBuilder();
        while(! s1.isEmpty()){
            ans.append(s1.pop());
        }
         
        return ans.reverse().toString();
    }
}