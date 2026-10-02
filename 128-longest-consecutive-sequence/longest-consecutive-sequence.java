import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n == 0) return 0;
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        int maxLen=0;
        for(Integer Element:set){
            int prevElm=Element - 1;
            if(! set.contains(prevElm)){
                int len=1;
                int nextElm=Element +1;
                while(set.contains(nextElm)){
                    len++;
                    nextElm++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}