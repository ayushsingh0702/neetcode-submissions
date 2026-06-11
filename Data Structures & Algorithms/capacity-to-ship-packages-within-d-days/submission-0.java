class Solution {
    public boolean is(int[] wt,int sload,int sdays){
        int cload=0;
        int day=1;

        for(int i=0;i<wt.length;i++){
            if(cload+wt[i]>sload){
                day =day+1;
                cload=wt[i];
            }
            else{
                cload += wt[i];
            }
        }
        if(day<= sdays){
            return true;
        }
        return false;
    }

    public int max(int[] nums){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        return max;
    }
    public int shipWithinDays(int[] weights, int days) {

    int high=0;

    for(int i=0;i<weights.length;i++){
        high += weights[i];
     }  

    int low = max(weights); 
    int ans = Integer.MAX_VALUE;

    while(low <= high){

        int mid = low+(high-low)/2;

        if(is(weights,mid,days)){
            ans = Math.min(ans , mid);
            high = mid-1;
        }
        else{
            low = mid + 1;
        }
    }
    return ans;

    }
}