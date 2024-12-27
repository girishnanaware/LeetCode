class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> matchingPairs = Map.of('(', ')', '[', ']', '{', '}');

        Stack<Character> stack = new Stack<Character>();
        if (s.startsWith(")") || s.startsWith("]") || s.startsWith("}")) {
            return false;
        }
        for (char chr : s.toCharArray()) {
            if (chr == '(' || chr == '[' || chr == '{') {
                stack.push(chr);
            } else {
                if (stack.isEmpty() || chr != matchingPairs.get(stack.peek())) {
                    return false;
                }
                stack.pop();

            }
        }


        return stack.isEmpty();

    }
}