// class Solution {
//     public int[] plusOne(int[] nums) {
//         ArrayList<Integer> ans = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {

//             if (i == nums.length - 1) {

//                 if (nums[i] == 9) {
//                     int sum = nums[i] + 1;
//                     int carry = sum / 10;
//                     int rem = sum % 10;

//                     ans.add(carry);
//                     ans.add(rem);

//                 } else {
//                     int res = nums[i] + 1;
//                     ans.add(res);
//                 }

//             } else {
//                 ans.add(nums[i]);
//             }
//         }

//         int[] result = new int[ans.size()];

//         for (int i = 0; i < ans.size(); i++) {
//             result[i] = ans.get(i);
//         }

//         return result;
//     }
// }

class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}