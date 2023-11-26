class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> ab = new PriorityQueue<>(Collections.reverseOrder());    
        for(int insert:stones) ab.offer(insert);
        while(ab.size()>1){
            int var1 = ab.poll();
            int var2 = ab.poll();
            int Delta  = Math.max(var1,var2) - Math.min(var1,var2);
            if( Delta > 0) ab.offer(Delta);
        }
        int weig = 0;
        if(!ab.isEmpty())  weig = ab.poll();
        return weig;
    }
}