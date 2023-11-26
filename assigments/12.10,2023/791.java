class Solution {
    public String customSortString(String order, String s) {
        int[] f = new int[26];
        for (char ch : s.toCharArray()) {
            f[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (char mh :order.toCharArray()) {
            while (f[mh - 'a'] > 0) {
                sb.append(mh);
                f[mh-'a']--;
            }
        }
        for (int x = 0; x<26;x++) {
            int frequency = f[x];
            while (frequency > 0) {
                sb.append((char) (x + 'a'));
                frequency--;
            }
        }
        return sb.toString();
    }
}