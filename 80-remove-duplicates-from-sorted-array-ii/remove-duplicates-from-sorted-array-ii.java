 class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        if (k <= 2) {
            return k;
        }
        int st = 0;
        int count = 1;

        for (int i = 0; i < k; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[st++] = nums[i];
            }
        }
        return st;
    }
}