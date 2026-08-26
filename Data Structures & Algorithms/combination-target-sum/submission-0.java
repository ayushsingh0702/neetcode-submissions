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

            if(index == nums.length){
                return;
            }

            if(nums[index]<= target){
                curr.add(nums[index]);
                sum(nums,target-nums[index],res,index,curr);
                curr.remove(curr.size()-1);
            }
            sum(nums,target,res,index+1,curr);        
    }
}
