class Solution {
    public int leastInterval(char[] task, int n) {

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        int[] track = new int[26];

        for(char in : task){
    
            track[in-'A']++;
        }

        for(int in : track){
            if(in>0){
                que.offer(in);
            }
        }

        int time = 0;
        while(!que.isEmpty()){
            
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0 ;i<n+1;i++){
                if(!que.isEmpty()){
                    int freq=que.poll();
                    freq--;
                    list.add(freq);
                }
            }

            for(int in : list){
                if(in>0){
                    que.offer(in);
                }
            }

            if(que.isEmpty()){
                time += list.size();
            }
            else{
                time += (n+1);
            }
        }
        return time;
    }
}
