 class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }

        int st = 0;
        int end = nums.length - 1;
        int mid = st + (end - st) / 2;

        if(map.get(nums[mid]) == 1){
            return true;
        }else{
            return false;
        }
    }
}