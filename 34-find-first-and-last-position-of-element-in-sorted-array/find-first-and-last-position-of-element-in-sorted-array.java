class Solution {
    public int[] searchRange(int[] nums, int target) {

        int firstO = findFirstOccurrence(nums, target);
        int secondO = findSecondOccurrence(nums, target);
        return new int[]{firstO, secondO};
    }
    public int findFirstOccurrence(int[] nums, int target) {
        int idx = -1;
        int st = 0;
        int end = nums.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                idx = mid;
                end = mid - 1; // search on left side
            }
            else if (nums[mid] < target) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return idx;
    }

    public int findSecondOccurrence(int[] nums, int target) {
        int idx = -1;
        int st = 0;
        int end = nums.length - 1;
        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (nums[mid] == target) {
                idx = mid;
                st = mid + 1;// search on right side
            }
            else if (nums[mid] < target) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return idx;
    }
}

