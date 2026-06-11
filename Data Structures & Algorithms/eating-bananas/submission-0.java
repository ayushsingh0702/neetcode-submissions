class Solution {

    public int find_max(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max= nums[i];
            }
        }
        return max;
    }

    public long dind_hour(int[] nums, int mid){
        long hour=0;
        for(int i=0;i<nums.length;i++){
                hour = hour + (long)Math.ceil((double)nums[i]/mid);    
        }
        return hour;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = find_max(piles);
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low+(high-low)/2;
            long hour= dind_hour(piles,mid);
            if(hour<=(int)h){
                ans = Math.min(ans,mid);
                high=mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return ans;
    }
}