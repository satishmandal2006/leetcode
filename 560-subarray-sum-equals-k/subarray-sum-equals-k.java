class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //(sum, count)

        int sum = 0;
        int ans = 0;

        map.put(0, 1);

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j]; // prefix sum

            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}