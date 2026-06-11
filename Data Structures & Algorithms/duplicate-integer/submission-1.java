class Solution {
    public boolean hasDuplicate(int[] nums) {

       HashMap<Integer,Integer> map = new HashMap<>();

       for(int n : nums){
        if(map.containsKey(n)){
            map.put(n,map.get(n)+1);
        }
        else{
            map.put(n,1);
        }
       }
       for(Map.Entry<Integer,Integer> mp : map.entrySet()){
        int set = mp.getValue();
        if(set>1){
            return true;
        }
       }
       return false;
    }
}