class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int lIdx = 0;
        int rIdx = k-1;

        for(int i=0; i<k-1; i++){
            sum+=nums[i];
        }

        while(rIdx < nums.length){
            sum += nums[rIdx];

            if(sum > max){
                max = sum;
            }

            sum -= nums[lIdx];
            lIdx++;
            rIdx++;

        }

        return (double)max/k;
    }
}