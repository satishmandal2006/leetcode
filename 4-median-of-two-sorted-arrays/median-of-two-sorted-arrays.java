class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;
        int[] temp = new int[n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            temp[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            temp[k++] = nums2[j++];
        }

        if (temp.length % 2 != 0) {
            return temp[temp.length / 2];
        } else {
            int mid = temp.length / 2;
            return (temp[mid - 1] + temp[mid]) / 2.0;
        }
    }
}