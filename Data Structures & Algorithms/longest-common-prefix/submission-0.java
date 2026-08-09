class Solution {
    public String longestCommonPrefix(String[] strs) {
        //brute force 
        int length = strs.length;
        if(length == 0){
            return "" ;
        }
        String comman = strs[0];

        for(int i = 1 ; i < strs.length;i++){
            String str = strs[i];
            int p = 0;
            int j = 0;
            String temp = "";
            while(p<comman.length() && j<str.length()){
                if(comman.charAt(p)==str.charAt(j)){
                    temp = temp + comman.charAt(p);
                }
                else{
                    break;
                }
                p++;
                j++;
            }
            comman=temp;
            if(comman.length()==0){
                break;
            }
        }
        return comman;
    }
}