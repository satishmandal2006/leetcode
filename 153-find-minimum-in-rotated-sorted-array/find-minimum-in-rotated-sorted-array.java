 class Solution {
    public int findMin(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
}

// class Solution {
//     public int findMin(int[] nums) {

//         int low = 0;
//         int high = nums.length - 1;
//         int min = Integer.MAX_VALUE;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             // Left half is sorted
//             if (nums[low] <= nums[mid]) {

//                 min = Math.min(min, nums[low]);
//                 low = mid + 1;

//             } else {

//                 // Minimum is in the left unsorted half
//                 min = Math.min(min, nums[mid]);
//                 high = mid - 1;
//             }
//         }

//         return min;
//     }
// }