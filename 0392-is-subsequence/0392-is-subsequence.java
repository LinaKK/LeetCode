class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() == 0) return true;
        if(s.length() > t.length()) return false;
        if(s.length() == t.length()) return (s.equals(t) ? true : false);
        
        // int idxS = 0;
        
        // for(int i=0; i<t.length(); i++){
        //     if (s.charAt(idxS) == t.charAt(i))
        //         idxS ++;
            
        //     if (idxS == s.length())
        //         return true;
        // }
        
        // return false;

        int sIdx = 0;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for(int i=0; i<tArray.length; i++){
            if(sArray[sIdx] == tArray[i]) sIdx++;
            if(sIdx == sArray.length) return true;
        }

        return false;
    }
}