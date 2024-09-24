class Solution {
    public void moveZeroes(int[] nums) {
        int countZero = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 0) {
        //         countZero++;
        //     } else {
        //         nums[i - countZero] = nums[i];
        //     }
        // }

        // for (int i = nums.length - countZero; i < nums.length; i++) {
        //     nums[i] = 0;
        // }


        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                countZero ++;
            }
            else {
                int num = nums[i];
                nums[i] = 0;
                nums[i-countZero] = num;
            }
        }

    }
}