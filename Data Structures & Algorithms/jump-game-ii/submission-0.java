class Solution {
    public int jump(int[] nums) {

        int res = 0;
        int max = 0;
        int end = 0;

        for(int i =0;i<nums.length;i++){
            if(max>= nums.length-1 && end>=nums.length-1){
                break;
            }
            max = Math.max(max ,nums[i]+i);
            if(i == end){
                res++;
                end = max;
            }
        }
        return res;
    }
}
