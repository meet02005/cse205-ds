class Solution {
    public int heightChecker(int[] heights) {
       int res = 0;
       int[] ans = new int[101];
       int curr = 1;
       for (int i : heights)
           ++ans[i];
        for (int i : heights) {
            while (ans[curr] == 0)
            curr++;
            if (i != curr) 
            ++res;
            --ans[curr];
        }
        return res;
    }
}