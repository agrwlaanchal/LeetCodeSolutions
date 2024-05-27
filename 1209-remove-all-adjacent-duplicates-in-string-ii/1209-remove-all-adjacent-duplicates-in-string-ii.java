import java.util.Stack;

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().c == c) {
                stack.peek().count++;
                if (stack.peek().count == k) {
                    stack.pop(); // Remove the pair from stack if count reaches k
                }
            } else {
                stack.push(new Pair(c, 1)); // Push new pair onto stack
            }
        }

        // Reconstruct the string from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            for (int i = 0; i < pair.count; i++) {
                sb.append(pair.c);
            }
        }

        // Reverse the string to get the correct order
        return sb.reverse().toString();
    }

    // Pair class to store character and its count
    private class Pair {
        char c;
        int count;

        public Pair(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }
}
