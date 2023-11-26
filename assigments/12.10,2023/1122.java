class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] array = new int[1001];
        for (int i : arr1) {
            array[i]++;
        }
        int n = 0;
        for (int i : arr2) {
            while (array[i]-- > 0) {
                arr1[n++]  =  i;
            }
        }
        for (int i = 0; i<array.length;i++) {
            while (array[i]-- > 0) {
                arr1[n++] = i;
            }
        }
        return arr1;
    }
}