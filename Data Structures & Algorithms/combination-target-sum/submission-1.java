class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        sum(nums,target,res,0,curr);
        return res;
    }
    private void sum(int[] nums,int target,List<List<Integer>> res,int index,List<Integer> curr){

            if(target==0){
                res.add(new ArrayList<>(curr));
                return;
            }

           for(int i = index;i<nums.length;i++){
            if(nums[i]>target){
                continue;
            }
               curr.add(nums[i]);
                sum(nums,target-nums[i],res,i,curr);
                curr.remove(curr.size()-1);
           }      
    }
}
