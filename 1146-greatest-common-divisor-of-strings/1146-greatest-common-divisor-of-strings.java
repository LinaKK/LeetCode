class Solution {
    public String gcdOfStrings(String str1, String str2) {

        String shorterStr = str1.length() <= str2.length() ? str1 : str2;
        String longerStr = str1.length() > str2.length() ? str1 : str2;

        if((shorterStr+longerStr).equals(longerStr+shorterStr)){
            for(int num=shorterStr.length(); num>0; num--){
                if(str1.length() % num == 0 && str2.length() % num == 0){
                    return (shorterStr+longerStr).substring(0, num);
                }
            }
            
        }

        return "";

    }

}

//solution
// class Solution {


        // 최대공약수 구하기
        // 흐름은 이해가 되지만 스스로 생각해내기는 어렵다
//     public int gcd(int a,int b)
//     {
            // 계속 나누면서 나머지가 0이라면 나누는수(a, return gcd(b,a%b);의 b)가 최대공약수이므로 해당 수 리턴
//         if(b==0)
//         return a;

//         return gcd(b,a%b);
//     }
//     public String gcdOfStrings(String str1, String str2) 
//     {
            // str1+str2 와 str2+str1이 같다 -> 공약수가 존재한다
            // 순서 반대로해서 합쳤을때 다르다는거는 두 문자열이 시작부터 다르다. 즉 공통된 문자열로 나눌수없음
            // 한번만 더해서 확인한 경우 공약수를 잘못 발견하게 되는문제도 해결가능
                // str1 = ABA, str2 = BAB, str1+str2=ABABAB but str2+str1=BABABA
            
//         String s=str1+str2;
//         if(!s.equals(str2+str1))return "";

            //공통된 문자열로 나눌수 있음을 알았으니 str1과 str2의 최대공약수(나눌수있는 문자열의 최대길이) 구해서 그만큼 substring
//         return str1.substring(0,gcd(str1.length(),str2.length()));

        
        
//     }
// }