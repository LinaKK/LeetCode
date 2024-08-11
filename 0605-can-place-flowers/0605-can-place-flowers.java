class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        if(n == 0) return true;
        
        if(flowerbed.length == 1){
            if (flowerbed[0] == 0 && n <= 1) return true;
            return false;
        }
       
        for(int i=0; i<flowerbed.length-1; i++){
            if(i == 0 || i == flowerbed.length-2){
                if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    n--;
                }
            }

            else if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i+2] == 0){
                n--;
                i++;
            }

            if(n == 0) return true;
        }

        return false;
    }
}