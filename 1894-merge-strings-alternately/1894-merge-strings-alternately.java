class Solution {
    public String mergeAlternately(String word1, String word2) {
        //문자열 조작이 빈번한 경우 Stirng보다 StringBuilder가 더 효율적

        StringBuilder result = new StringBuilder();
        
        int idx=0;
        while(idx < word1.length() && idx < word2.length()){
            
            result.append(word1.charAt(idx));
            result.append(word2.charAt(idx));
            
            idx++;
            
        }
        
        if(word1.length() > idx){
            result.append(word1.substring(idx));
        }
        else if(word2.length() > idx){
            result.append(word2.substring(idx));
        }
        
        return result.toString();
    }
}