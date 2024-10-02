class Solution {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int lIdx = 0;
        int rIdx = nums.length-1;
        int operation = 0;

        while((nums[rIdx] > k) && (lIdx < rIdx)){
            rIdx--;
        }

        while(lIdx < rIdx){
            int sum = nums[rIdx] + nums[lIdx];
            if(sum == k){
                operation++;
                lIdx++;
                rIdx--;
            }
            else if(sum < k) lIdx++;
            else if(sum > k) rIdx--;
        }

        return operation;

        // int pick1 = 0;
        // int operation = 0;

        // for(int i=0; i<nums.length-1; i++){
        //     if(nums[i] == 0) continue;
        //     pick1 = nums[i];
        //     int idx = i+1;
            
        //     while(idx < nums.length){
        //         if(nums[idx] == 0){
        //             idx++;
        //             continue;
        //         }
        //         else if((nums[idx] + pick1) == k){
        //             nums[i] = 0;
        //             nums[idx] = 0;
        //             operation ++;
        //             break;
        //         }
        //         idx++;
        //     }

        // }

        // return operation;
    }
}