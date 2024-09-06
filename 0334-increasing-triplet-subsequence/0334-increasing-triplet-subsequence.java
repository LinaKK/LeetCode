class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3){
            return false;
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num : nums){
            if(min1 >= num){
                min1 = num;
            } else if(min2 >= num){
                min2 = num;
            } else{
                return true;
            }
        }

        return false;



    }
}