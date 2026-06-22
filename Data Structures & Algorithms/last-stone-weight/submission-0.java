class Solution {
    public int lastStoneWeight(int[] stones) {

       PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
       for(int st : stones){
        heap.offer(st);
       }

       System.out.println(heap);

       while(heap.size()>=2){
        int big = heap.poll();
        int small = heap.poll();
        int sub = big - small;
        if(sub>0){
        heap.offer(sub);
        }
       }
       if(heap.size()==1){
        return heap.poll();
       }
     
       return 0;
    }
}
