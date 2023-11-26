class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximum = accounts[0][0];
        for (int customer[] : accounts) {
            int sum = 0;
            for (int bank : customer) {
                sum = sum + bank;
            }
            maximum = Math.max(maximum,sum);
        }
        return maximum;
    }
}