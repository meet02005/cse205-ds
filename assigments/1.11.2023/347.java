class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> solution = new HashMap<>();
        for(int num : nums) {
        solution.put(num,solution.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> priorityqueue = new PriorityQueue<>((x1,x2)->Integer.compare(x1[1], x2[1]));
        for (Map.Entry<Integer, Integer> a : solution.entrySet()) {
            priorityqueue.add(new int[]{a.getKey(), a.getValue()});
            while (priorityqueue.size() > k) {
                priorityqueue.poll();
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = priorityqueue.poll()[0];
        }
        return ans;
    }
}