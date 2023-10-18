class Solution {
    public boolean backspaceCompare(String s, String t) {
        int index1 = s.length() - 1, index2 = t.length() - 1;
        int i1 = index1, i2 = index2;
        while (index1 >= 0 || index2 >= 0) {
            i1 = nextElementIndex(s, index1);
            i2 = nextElementIndex(t, index2);

            if (i1 < 0 && i2 < 0) return true;
            if (i1 < 0 || i2 < 0) return false;
            if (s.charAt(i1) != t.charAt(i2)) return false;

            index1 = i1; index1--;
            index2 = i2; index2--;
        }
        return true;
    }
    
    public int nextElementIndex(String str, int index) {
        if (index < 0) return -1;
        int backSpaceCount = 0;
        char nextElement = str.charAt(index);
        while (index >= 0 && (str.charAt(index) == '#' || backSpaceCount != 0)) {
            nextElement = str.charAt(index);     
            if (nextElement == '#') backSpaceCount++; 
            else if (nextElement != '#') backSpaceCount--;
            index--; 
        }
        return index;
    }
}