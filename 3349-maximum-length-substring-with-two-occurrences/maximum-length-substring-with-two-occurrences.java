class Solution {
    public int maximumLengthSubstring(String s) {
        int freq[]=new int[26];
        int j=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch - 'a']++;
            while(freq[ch - 'a'] > 2){
                char leftChar=s.charAt(j);
                freq[leftChar - 'a']--;
                j++;
            }
            maxLength=Math.max(maxLength,i-j+1);
        }
        return maxLength;
    }
}