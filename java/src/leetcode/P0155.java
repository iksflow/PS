package leetcode;

import java.util.Arrays;

public class P0155 {
    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2

    }

    static class MinStack {
        int index;
        int[] stack;
        /** initialize your data structure here. */
        public MinStack() {
            index = 0;
            stack = new int[100];
        }

        public void push(int x) {
            if (index == stack.length) {
                stack = Arrays.copyOf(stack, stack.length + 100);
            }
            stack[index] = x;
            index++;
        }

        public void pop() {
            index--;
        }

        public int top() {
            return stack[index - 1];
        }

        public int getMin() {
            int min = stack[0];

            for (int i = 1; i < index; i++) {
                if (stack[i] < min) {
                    min = stack[i];
                }
            }

            return min;
        }
    }
}
