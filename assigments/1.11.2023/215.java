class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        while (pq.isEmpty()) {
        for (int i = 0; i<nums.length; i++) {
            pq.add(nums[i]);
        }
        }
         int max = nums[nums.length - k];
         return max;     
    }
}