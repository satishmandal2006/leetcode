class Solution {
    public int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = (start + end) / 2;

            // Make mid even
            if (mid % 2 != 0) {
                mid--;
            }

            // Pair is correct
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } 
            // Pair is broken, single element is on left
            else {
                end = mid;
            }
        }

        return nums[start];
    }
}