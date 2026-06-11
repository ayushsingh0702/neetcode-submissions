class Solution {
    public int ser(int low , int high , int[] nums , int target){
      if(low > high){
        return -1;
      }  

      int mid = low+(high-low)/2;
      if(nums[mid]==target){
        return mid;
      }
      else if(nums[mid]>target){
        return ser(low,mid-1,nums,target);
      }
      else{
        return ser(mid+1,high,nums,target);
      }
    }
    public int search(int[] nums, int target) {
        return ser(0,nums.length-1,nums,target);
    }
}
