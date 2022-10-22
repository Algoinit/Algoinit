public class P12909 {
    public boolean correctBrackets(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if(stack.isEmpty()) return false;
                stack.pop();
                continue;
            }
            stack.add(s.charAt(i));
        }

        return stack.isEmpty();
    }
}
