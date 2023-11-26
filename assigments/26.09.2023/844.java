class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();
        for (int i = 0; i<s.length();i++) {
            if (s.charAt(i) == '#') {
                if (s1.length() >= 1) {
                    s1.deleteCharAt(s1.length()-1);
                }     
            }
            else {
                s1.append(s.charAt(i));
            }
        }
        String s2 = s1.toString();
        for (int j = 0; j<t.length();j++) {
            if (t.charAt(j) == '#') {
                if (t1.length() >= 1) {
                    t1.deleteCharAt(t1.length()-1);
                }     
            }
            else {
                t1.append(t.charAt(j));
            }
        }
        String s3 = t1.toString();

        return s2.equals(s3);
    }
}