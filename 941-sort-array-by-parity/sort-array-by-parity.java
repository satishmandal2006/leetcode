class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int ans[]=new int[nums.length];
        int st=0;
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2==0){
                ans[st]=nums[i];
                st++;
            }else{
                ans[end]=nums[i];
                end--;
            }
        }
        return ans;
    }
}