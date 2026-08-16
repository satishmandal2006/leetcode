class Solution {
    public void nextPermutation(int[] nums) {
        int piv=-1;
        for(int i=nums.length - 2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                piv=i;
                break;
            }
        }
        if(piv==-1){
            int i=0;
            int j=nums.length-1;
            while(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            return;
        }
         for (int i = nums.length - 1; i > piv; i--) {
            if (nums[i] > nums[piv]) {

                int temp = nums[i];
                nums[i] = nums[piv];
                nums[piv] = temp;

                break;
            }
        }

        int i=piv+1;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}