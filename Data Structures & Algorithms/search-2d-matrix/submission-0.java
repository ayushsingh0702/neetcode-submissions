class Solution {
    public boolean find(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid]== target){
                return true;
            }
            else if(nums[mid]< target){
                low = mid + 1;
            }
            else{
                high = mid - 1; 
            }    
        }
         return false;
    }

    public boolean searchMatrix(int[][] nums, int target) {
        boolean ans = false;
        int col = nums[0].length;
        for(int i=0;i<nums.length;i++){
            if(nums[i][0]<=target && nums[i][col-1]>=target){
                ans = find(nums[i],target);
            }
        }  
        return ans;
    }
}