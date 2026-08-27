class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }
    
    private int findBound(int[] nums, int target, boolean findFirst) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                result = mid;
                if (findFirst) {
                    end = mid - 1;   // match found — keep searching left for an earlier one
                } else {
                    start = mid + 1; // match found — keep searching right for a later one
                }
            }
        }
        
        return result;
    }
}