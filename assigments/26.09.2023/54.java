class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int row = matrix.length;
       int col = matrix[0].length;
       List<Integer> list = new ArrayList();

       if (row == 0) return list;
       int a = 0, b = col-1, c = 0, d = row - 1, e = 0;
       while (a<=b && c<=d) {
           if (e == 0) {
            for (int i = a; i<=b; i++) {
                list.add(matrix[c][i]);
            }
            e = 1;c++;
           }
           else if (e == 1) {
               for (int i = c; i<=d;i++) {
                   list.add(matrix[i][b]);
               }
            e = 2;b--;
           }
           else if (e == 2) {
               for (int i = b; i>=a; i--) {
                   list.add(matrix[d][i]);
               }
            e = 3;d--;
           }
           else if (e == 3) {
               for (int i = d; i>=c;i--) {
                   list.add(matrix[i][a]);
               }
            e = 0;a++;
           }
       }
        return list;
    }
}