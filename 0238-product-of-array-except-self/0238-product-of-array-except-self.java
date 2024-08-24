class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        Arrays.fill(output, 1);

        int product = 1;

        for(int i=0; i<nums.length; i++){
            output[i] *= product;
            product *= nums[i];
        }

        product = 1;
        for(int i=nums.length-1; i>=0; i--){
            output[i] *= product;
            product *= nums[i];
        }

        return output;


        // int[] ans = new int[nums.length];
        // int curr = 1;

        // Arrays.fill(ans, 1);

        // for(int i=0; i<nums.length; i++){
        //     ans[i] *= curr;
        //     curr *= nums[i];
        // }

        // curr =1;
        // for(int i= nums.length-1; i>=0; i--){
        //     ans[i] *= curr;
        //     curr *= nums[i];
        // }

        // return ans;
    }   
}