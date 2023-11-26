class Solution {
    public String removeStars(String s) {
     Stack<Character> stack = new Stack<>();
     for (int i = 0; i<s.length();i++) {
         if (s.charAt(i) == '*') {
             stack.pop();
         }
         else {
             stack.push(s.charAt(i));
         }
     }
     StringBuilder s1 = new StringBuilder();
     for (char ch : stack) {
         s1.append(ch);
     }
     return s1.toString();
    }
}