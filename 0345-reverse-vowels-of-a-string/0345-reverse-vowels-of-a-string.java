class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(Set.of('a','e','i','o','u','A','E','I','O','U'));
        char[] sArray = s.toCharArray();
        int leftIdx = 0;
        int rightIdx = sArray.length-1;

        while(leftIdx < rightIdx){
            if(vowels.contains(sArray[leftIdx])){
                if(vowels.contains(sArray[rightIdx])){
                    char buf = sArray[leftIdx];
                    sArray[leftIdx] = sArray[rightIdx];
                    sArray[rightIdx] = buf;
                    leftIdx ++;
                    rightIdx --;
                    continue;
                }
                rightIdx --;
                continue;
            }
            leftIdx ++;
        }
        
        String result = String.valueOf(sArray);
        return result;

        // HashSet<Character> vowels = new HashSet<>(Set.of('a','e','i','o','u','A','E','I','O','U'));
        // char[] sArray = s.toCharArray();
        // int leftIdx = 0;
        // int rightIdx = sArray.length-1;

        // while(leftIdx < rightIdx){
        //     if(vowels.contains(sArray[leftIdx])) {
        //         if(vowels.contains(sArray[rightIdx])){
        //             char buf = sArray[leftIdx];
        //             sArray[leftIdx] = sArray[rightIdx];
        //             sArray[rightIdx] = buf;
        //             leftIdx ++;
        //             rightIdx --;
        //         }
        //         else{
        //             rightIdx --;
        //         }
        //     }
        //     else{
        //         leftIdx ++;
        //     }
        // }
        

        // return String.valueOf(sArray);
    }
    
}