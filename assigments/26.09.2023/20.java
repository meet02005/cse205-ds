class Solution {
    public boolean isValid(String s) {
        Stack<Character> A1 = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') 
               A1.push(')');
            else if (c == '[')
               A1.push(']');
            else if (c == '{')
               A1.push('}');
            else if (A1.isEmpty() || A1.pop() != c) return false;
        }      
        return A1.isEmpty();
} 
}
