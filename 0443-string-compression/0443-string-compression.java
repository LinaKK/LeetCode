class Solution {
    public int compress(char[] chars) {
        if (chars.length <= 1) return chars.length;

        int count = 1;
        int idx = 0;
        char c = ' ';

        for(int i=0; i<chars.length-1; i++){
            if(chars[i] == chars[i+1]){
                count ++;

                if(i == chars.length-2) c = chars[i];
            }
            else {
                c = chars[i];
                chars[idx++] = c;
                if(count > 1) {
                    for(char countC : String.valueOf(count).toCharArray()){
                    chars[idx++] = countC;
                    }

                    count = 1;
                }
                
                if(i == chars.length-2) c = chars[i+1];
            }
        }

        chars[idx++] = c;
        if(count > 1){
            for(char countC : String.valueOf(count).toCharArray()){
                    chars[idx++] = countC;
            }
        }
        
        return idx;

        // if (chars.length <= 1) return chars.length;

        // String s= "";
        // int count = 1;
        // int idx = 0;

        // for(int i=0; i<chars.length-1; i++){
        //     if(chars[i] == chars[i+1]){
        //         count++;

        //         if(i == chars.length-2) s += chars[i] + String.valueOf(count);
        //     }
        //     else{
        //         if(count == 1) s += chars[i];
        //         else s += chars[i] + String.valueOf(count);
        //         count = 1;

        //         if(i == chars.length-2) s += chars[i+1];
        //     }

        // }

        // for(char c : String.valueOf(s).toCharArray()){
        //     chars[idx] = c;
        //     idx++;
        // }

        // return s.length();


        // int ans = 0;
        // char letter = ' ';
        // int count = 0;

        // for(int i=0; i<chars.length;){
        //     letter = chars[i];
        //     count = 0;

        //     while(i<chars.length && chars[i]==letter){
        //         count ++;
        //         i++;
        //     }

        //     chars[ans++] = letter;
            
        //     if(count > 1){
        //         for(char c : String.valueOf(count).toCharArray()){
        //             chars[ans++] = c;
        //         }
        //     }
        // }

        // return ans;



        // if(chars.length == 1) return 1;

        // String s = "";
        // int count = 1;

        // for(int i=0; i<chars.length-1; i++){
        //     if(chars[i] == chars[i+1]){
        //         count++;

        //         if(i == chars.length-2){
        //             s += chars[i];
        //             s += count;
        //         }

        //     } else{
        //         s += chars[i];
        //         if(count !=1){
        //             s += count;
        //         }
                
        //         count = 1;
                
        //         if(i == chars.length-2){
        //             s += chars[i+1];
        //         }

        //     }
        // }


        // for(int i=0; i<s.length(); i++){
        //     // if(i > s.length()-1) {
        //     //     chars[i] = ' ';
        //     // } else{
        //     //     chars[i] = s.charAt(i);
        //     // }
        //     chars[i] = s.charAt(i);
        // }

        // return s.length();
    }
}