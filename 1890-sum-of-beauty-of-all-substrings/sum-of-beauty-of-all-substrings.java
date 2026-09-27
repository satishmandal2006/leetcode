class Solution {

    public int getMinimum(int[] freq) {
        int minCount = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                minCount = Math.min(minCount, freq[i]);
            }
        }
        return minCount;
    }

    public int getMaximum(int[] freq) {
        int maxCount = 0;
        for(int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, freq[i]);
        }
        return maxCount;
    }

    public int beautySum(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            int freq[] = new int[26];
            for(int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                int beauty = getMaximum(freq) - getMinimum(freq);
                sum += beauty;
            }
        }

        return sum;
    }
}