class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i : nums) {
            hashmap.put(i, hashmap.getOrDefault(i,0) + 1);
        }
        Queue<Integer> A = new PriorityQueue<>((a,b) -> hashmap.get(b) - hashmap.get(a));
        for (int j : hashmap.keySet()) {
            A.add(j);
        }
        int[] res = new int[k];
        for (int i = 0; i<k; i++) {
            res[i] = A.poll();
        }
        return res;
    }
}