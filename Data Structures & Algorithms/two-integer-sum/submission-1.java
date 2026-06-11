class Solution {
    public int[] twoSum(int[] nums, int target) {
       //brute force  
       int len = nums.length;

    //    for(int i=0;i<len;i++){
    //     for(int j=i+1;j<len;j++){
    //         if(nums[i]+nums[j]==target){
    //             return new int[] {i , j};
    //         }
    //     }

    //    }
    //    return new int[] {-1,-1};

        // with hashmap

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<len;i++){
            int wants = target - nums[i];

            if(map.containsKey(wants)){
                return new int[] {map.get(wants),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}
