class Solution {
    public String reverseWords(String s) {

        // Remove leading and trailing spaces
        s = s.trim();

        StringBuilder str = new StringBuilder();

        // Remove multiple spaces
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' || 
                (i > 0 && s.charAt(i - 1) != ' ')) {
                str.append(s.charAt(i));
            }
        }

        // Step 1: Reverse each individual word
        int start = 0;

        for (int i = 0; i <= str.length(); i++) {

            if (i == str.length() || str.charAt(i) == ' ') {

                int left = start;
                int right = i - 1;

                while (left < right) {
                    char temp = str.charAt(left);
                    str.setCharAt(left, str.charAt(right));
                    str.setCharAt(right, temp);

                    left++;
                    right--;
                }

                start = i + 1;
            }
        }

        // Step 2: Reverse complete string
        str.reverse();

        return str.toString();
    }
}