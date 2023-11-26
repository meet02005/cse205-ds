class Solution {    
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> fin = new ArrayList();
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length-1; i++) {
            int l = arr[i+1]-arr[i];
            if (l<diff) {
                diff = l;
                fin.clear();
                fin.add(Arrays.asList(arr[i],arr[i+1]));
            }
            else if (diff == l) {
                fin.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return fin;
    }
}