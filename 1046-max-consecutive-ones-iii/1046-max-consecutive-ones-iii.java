class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int count = 0;
        int left = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count++;
                while(count > k){
                    if(nums[left++] == 0) count--;
                }
            }
            max = Math.max(max, i-left+1);

        }

        return max;

        // int max = 0;
        // int count = 0;
        // int start = 0;

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == 0) count++;
        //     if(count > k){
        //         max = max > (i-start) ? max : (i-start);
        //         i = start;
        //         start++;
        //         count = 0;
        //     }
        // }
        // max = max > (nums.length-1-start+1) ? max : (nums.length-1-start+1);

        // return max;

    }
}