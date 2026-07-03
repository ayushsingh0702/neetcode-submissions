class Solution {
    public int lengthOfLongestSubstring(String s) {
    //hashmaP + slinding window problem 

    HashMap<Character,Integer> map = new HashMap<>();
    int start = 0;
    int end = 0;
    int max = Integer.MIN_VALUE;

    while(end<s.length()){

        char ch = s.charAt(end);
        if(!map.containsKey(ch)){
            map.put(ch,1);
        }
        else{
            map.put(ch , map.get(ch)+1);
        }
        while(map.get(ch)>1){
            char p = s.charAt(start);
            map.put(p,map.get(p)-1);
            start++;
        }
        max = Math.max(max,(end-start+1));
       end++;
    }
    if(max == Integer.MIN_VALUE){
        return 0;
    }
    return max;
    }
}
