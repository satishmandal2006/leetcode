class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        if(s.equals("")){
            return true;
        }
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else{
                return false;
            } 
        }
        return true;
    }
}