class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int rev = 0;
        int temp=x;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            
            rev = rev * 10 + digit;
        }
        if(rev == temp){
            return true;
        }else {
            return false;
        }
    }
}