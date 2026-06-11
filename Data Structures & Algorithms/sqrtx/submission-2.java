class Solution {
    public int mySqrt(int x) {
     long low = 1;
     long  high = x;
     int res = 0;

     while(low<=high){
        long mid = low+(high-low)/2;

        if(mid*mid<=x){
            res = (int)mid ;
            low = mid + 1;
        }
        else{
            high = mid -1 ;
        }
     }   
     return res ;
    }
}