class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> con = new ArrayList<>();
       List<List<Integer>> res = new ArrayList<>();
        back(con,res,nums,0);
        return res;
    }

    public void  back(List<Integer> con , List<List<Integer>> res,int[] nums,int index){

        if(index==nums.length){
            res.add(new ArrayList<>(con));
            return;
        }

        // include 
        con.add(nums[index]);
        // explore
        back(con,res,nums,index+1);

        //remove
        con.remove(con.size()-1);
        //na ke liye aage bado
        back(con,res, nums, index+1);
    }
}
