class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> Map = new HashMap<>();
        String[] map = s.split(" ")   
        if (map.length != pattern.length())
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char A = pattern.charAt(i);
            String B = map[i];
            if (Map.containsKey(A)) {
                if (!Map.get(A).equals(B))
                    return false;
            } else {
                if (Map.containsValue(B))
                    return false;
                Map.put(A, B);
            }
        }
        return true;
    }
}