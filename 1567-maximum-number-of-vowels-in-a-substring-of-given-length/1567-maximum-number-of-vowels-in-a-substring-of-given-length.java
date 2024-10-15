class Solution {
    public int maxVowels(String s, int k) {

        char[] sArray = s.toCharArray();
        String vowels = "aeiou";
        
        int max = 0;
        int count = 0;
        int lIdx = 0;
        int rIdx = k-1;

        for(int i=0; i<k; i++){
            if(vowels.indexOf(sArray[i]) != -1) count++;
        }
        
        max = count;
        lIdx++;
        rIdx++;

        for(; rIdx<sArray.length; rIdx++){
            if(vowels.indexOf(sArray[lIdx-1]) != -1) count--;
            if(vowels.indexOf(sArray[rIdx]) != -1) count++;
            max = max < count ? count : max;

            lIdx++;
        }

        return max;
    }
}