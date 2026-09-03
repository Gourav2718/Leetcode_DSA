class Solution {
    public int findDuplicate(int[] nums) {
        // int ans = 0;
        // for(int i=0; i<nums.length; i++){
        //     int ele = nums[i];
        //     ele = Math.abs(ele);

        //     if(nums[ele]>0){
        //         nums[ele]=-nums[ele];
        //     }else{
        //         ans = ele;
        //         break;
        //     }
        // }

        // for(int i=0; i<nums.length; i++){
        //     nums[i]=Math.abs(nums[i]);
        // }
        // return ans;


        int i = 0;

        while(i < nums.length){
            if(nums[i] != i + 1){
                int correct = nums[i] - 1;

                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }

        return -1;
    }

    void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}