class Solution {
    public int minSetSize(int[] arr) {
        int[] A = new int[100000];
        int l = arr.length/2;
        int c = 0;
        int sum = 0;

        for (int i : arr) {
            A[i-1]++;
        }
         Arrays.sort(A);
        for (int i = 99999; sum < l; i--) {
            sum = sum + A[i];
            c++;
        }
        return c;
    }
}