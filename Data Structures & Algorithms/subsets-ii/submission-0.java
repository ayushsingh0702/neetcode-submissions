class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
         back(current,res,0,nums);
        return res;
    }

    public void back(List<Integer> current, List<List<Integer>> res,int index,int[] nums){

        if(index == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);

        back(current,res,index+1,nums);

        current.remove(current.size()-1);

       while(index+1< nums.length && nums[index]==nums[index+1]){
            index++;
       }
       back(current,res,index+1,nums);
    }
}










