class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ans.add(0);
                ans.add(0);
            } else {
                ans.add(arr[i]);
            }
            if (ans.size() >= n) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = ans.get(i);
        }
    }
}

// class Solution {
//     public void duplicateZeros(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             if (arr[i] == 0) {
//                 for (int j = n - 1; j > i; j--) {
//                     arr[j] = arr[j - 1];
//                 }
//                 arr[i + 1] = 0;
//                 i++;
//             }
//         }
//     }
// }
