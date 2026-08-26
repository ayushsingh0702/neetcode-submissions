class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        back(nums,target,res,list,0);
        return res;
    }

    private void back(int[] nums, int target,List<List<Integer>> res,List<Integer> list,int index){
        if(target<0){
            return;
        }
        if(0==target){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i<nums.length;i++){
            if(i > index && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            back(nums,target-nums[i],res,list,i+1);
            list.remove(list.size()-1);
        }
    }
}
