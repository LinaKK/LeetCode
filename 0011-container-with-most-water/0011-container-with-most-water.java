class Solution {
    public int maxArea(int[] height) {
        
        if(height.length == 2) return height[0] >= height[1] ? height[1] : height[0]; 

        int leftIdx = 0;
        int rightIdx = height.length-1;
        int h = 0;
        int max = 0;

        while(leftIdx < rightIdx){
            h = height[leftIdx] <= height[rightIdx] ? height[leftIdx] : height[rightIdx];
            max = h*(rightIdx-leftIdx) > max ? h*(rightIdx-leftIdx) : max;

            if(height[leftIdx] < height[rightIdx]) leftIdx++;
            else rightIdx--;
        }

        return max;


        // int leftIdx = 0;
        // int rightIdx = height.length-1;
        // int h = 0;
        // int max = 0;
        // int currentArea = 0;
        
        // h = height[leftIdx] < height[rightIdx] ? height[leftIdx] : height[rightIdx];
        // max = rightIdx * h;
        
        // while(leftIdx < rightIdx){
        //     h = height[leftIdx] < height[rightIdx] ? height[leftIdx] : height[rightIdx];
        //     currentArea = (rightIdx-leftIdx) * h;
            
        //     if(currentArea > max) max = currentArea;
            
        //     if(height[leftIdx] > height[rightIdx]) rightIdx--;
        //     else leftIdx++;
        // }
        
        // return max;
        
    }
}