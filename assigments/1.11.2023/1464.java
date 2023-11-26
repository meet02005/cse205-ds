class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0 ; i<nums.length; i++) {
            PQ.add(nums[i]);
        }
        int one = PQ.poll();
        int second = PQ.poll();
        return (one-1)*(second-1);
    }
}