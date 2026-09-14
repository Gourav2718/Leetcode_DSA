class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int right = 0;
        int left = 0;

        int zeros = 0;
        int maxlength = 0;

        while(right < nums.length){
            if(nums[right] != 0){
                int length = right - left + 1;

                maxlength = Math.max(length, maxlength);
            }
            if(nums[right] == 0){
                left = right + 1;
            }

            right ++;
        }

        return maxlength;
    }
}