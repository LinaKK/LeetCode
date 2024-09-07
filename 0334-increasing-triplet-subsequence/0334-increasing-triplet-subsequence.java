class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3){
            return false;
        }
        // 오름차순으로 상자 3개가 채워지면 true_마지막은 true를 return 하므로 3번째 상자는 else return true로 대체
        // 상자3개에는 true를 만든 최종 결과값이 들어가는게 아니라 오름차순 3개 여부 count목적._2번째 상자가 채워졌다는것은 현재까지 nums[i] < nums[j] (i<j)가 존재한다는 의미
        // 두번째 상자가 채워진 상태에서 첫번째 상자의 값이 변하는것은 문제가 되지 않는다. 세번째 상자를 채울수 있는지가 중요
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