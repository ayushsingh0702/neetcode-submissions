class Solution {
    public int[] getConcatenation(int[] nums) {

       int n = nums.length;
       int[] arr = new int[2*n];

        int k =0;

       for(int i=0;i<2*nums.length;i++){
        arr[k++] = nums[i%(n)];
       } 
       return arr;
    }
}