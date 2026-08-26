class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int num : nums){
            if(evenDigits(num)){
                count ++;
            }
        }

        return count;
    }

    boolean evenDigits(int num){
        return Digits(num) % 2  == 0;
    }

    int Digits(int nums){
        // int count = 0;

        // while(nums > 0){
        //     count ++;
        //     nums /= 10;
        // }

        String s = String.valueOf(nums); 
        int count = s.length(); 
        return count;
    }
}