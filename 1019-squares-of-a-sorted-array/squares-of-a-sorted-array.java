class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int n=ans.length-1;
        while(left <= right){
            if(Math.abs(nums[left])>=Math.abs(nums[right])){
                ans[n]=nums[left] * nums[left];
                left++;
                n--;
            }else{
                ans[n]=nums[right]*nums[right];
                right--;
                n--;
            }
        }
        return ans;
    }
}