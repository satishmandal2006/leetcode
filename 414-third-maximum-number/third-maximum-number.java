import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                pq.add(nums[i]);

                if (pq.size() > 3) {
                    pq.remove();
                }
            }
        }

        if (pq.size() < 3) {
            while (pq.size() > 1) {
                pq.remove();
            }
        }

        return pq.peek();
    }
}