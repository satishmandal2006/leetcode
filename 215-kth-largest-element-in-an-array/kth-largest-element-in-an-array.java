import java.util.*;

// class Solution {
//     public int findKthLargest(int[] nums, int k) {
        
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         for (int i = 0; i < nums.length; i++) {
//             pq.add(nums[i]);
//         }

//         while (!pq.isEmpty()) {
//             if (pq.size() > k) {
//                 pq.remove();
//             } else {
//                 return pq.peek();
//             }
//         }

//         return -1;
//     }
// }

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
            if(pq.size() > k){
                pq.remove(); 
            }
        }
        return pq.peek();
    }
}

