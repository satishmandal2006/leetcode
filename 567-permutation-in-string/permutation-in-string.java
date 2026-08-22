 class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Store frequency of characters in s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();

        // Sliding window
        for (int i = 0; i < s2.length(); i++) {

            // Add current character
            freq[s2.charAt(i) - 'a']--;

            // Remove character outside the window
            if (i >= windowSize) {
                freq[s2.charAt(i - windowSize) - 'a']++;
            }

            // Check if frequencies match
            boolean found = true;

            for (int j = 0; j < 26; j++) {
                if (freq[j] != 0) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return true;
            }
        }

        return false;
    }
}