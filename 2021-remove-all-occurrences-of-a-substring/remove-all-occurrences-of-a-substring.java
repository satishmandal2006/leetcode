class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append(ch);
        } 
        int index;
        while (sb.indexOf(part) != -1){
            index = sb.indexOf(part);

            if (index != -1) {
               sb.delete(index, index + part.length());
            }
        }
        return sb.toString();
    }
}