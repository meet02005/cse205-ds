class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->score[b]-score[a]);
        String[] m = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            pq.add(i);
        }
        int i = 1;
        while (!pq.isEmpty()) {
            int index = pq.poll();
        
        if (i > 3) m[index] = Integer.toString(i);
        else if (i == 1) m[index] = "Gold Medal";
        else if (i == 2) m[index] = "Silver Medal";
        else if (i == 3) m[index] = "Bronze Medal";
        i++;
        }
        return m;
    }
}