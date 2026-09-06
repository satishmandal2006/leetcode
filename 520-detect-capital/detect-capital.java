class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch >= 'A' && ch <='Z'){
                count++;
            }
        }
        //for 1 cond
        if(count == word.length()){
            return true;
        }
        //for 2nd cond
        if(count == 0){
            return true;
        }

        if(count == 1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}