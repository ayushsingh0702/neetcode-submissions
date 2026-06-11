class Solution {
    public int majorityElement(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max = Integer.MIN_VALUE;
        int ans =0;
        for(Map.Entry<Integer,Integer> mapp : map.entrySet()){
            int key = mapp.getKey();
            int value=mapp.getValue();
            if(value>max){
                max= value;
                ans = key;
            }
        }
        return ans;
    }
}