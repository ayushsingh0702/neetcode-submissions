class Solution {
    public boolean isPalindrome(String s) {
       
       String res = "";
     

       for(int i =0 ; i<s.length();i++){
        char ch = s.charAt(i);
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9')){
            if((ch>='A' && ch<='Z')){
                ch = (char)(ch+32);
                
            }
            res = res + ch;
        }
       }
       int right = res.length()-1;
       int left = 0 ;
        System.out.println(res);
       while(right>=left){
        if((res.charAt(right)!=res.charAt(left))){
            return false;
        }
        left++;
        right--;
       }
       return true;
    }
}
