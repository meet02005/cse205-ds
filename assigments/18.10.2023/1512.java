class Solution {
    public int numIdenticalPairs(int[] nums) {
        int SUM = 0;
        int[] A = new int[101];
        for (int i : nums) {
            SUM += A[i]++;
        }
        return SUM;
    }
}