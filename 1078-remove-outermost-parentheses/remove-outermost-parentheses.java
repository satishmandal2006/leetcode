class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count++;
                if (count > 1) {
                    result.append(ch);
                }
            } else {
                
                count--;

                
                if (count > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}