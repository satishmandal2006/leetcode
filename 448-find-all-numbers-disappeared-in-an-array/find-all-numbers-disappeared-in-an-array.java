import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        int i = 1;
        int j = 0;

        while (i <= nums.length) {

            if (j < nums.length && nums[j] == i) {
                i++;
                j++;
            } 
            else if (j < nums.length && nums[j] < i) {
                j++;
            } 
            else {
                ans.add(i);
                i++;
            }
        }

        return ans;
    }
}