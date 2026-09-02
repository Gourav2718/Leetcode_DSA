class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Put nums2 elements into the empty space of nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // Sort nums1
        Arrays.sort(nums1);
    }
}