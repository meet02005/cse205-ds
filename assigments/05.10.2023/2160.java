class Solution {
    public int minimumSum(int num) {
        int[] A = new int[4];
        int i = 0;

        while (num != 0) {
            A[i++] = num % 10;
            num = num/10;
        }
        Arrays.sort(A);
        return ((A[0]*10  + A[3]) + (A[1]*10  + A[2]));
    }
}