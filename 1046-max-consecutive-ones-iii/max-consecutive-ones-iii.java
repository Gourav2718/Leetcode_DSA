class Solution {
    public int longestOnes(int[] nums, int n) {
        int right = 0;
        int left = 0;

        int zeros = 0;
        int maxlength = 0;

        while(right < nums.length){
            if(nums[right] == 0){
                zeros++;
            }

            if(zeros > n){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }

            if(zeros <= n){
                int length = right - left + 1;

                maxlength = Math.max(maxlength, length);
            }
            right ++;
        }

        return maxlength;
    }
}