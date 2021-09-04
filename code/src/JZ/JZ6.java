package JZ;

import java.util.Stack;

/**
 * @author Aaron
 * @date 2021/7/3 12:01
 */
public class JZ6 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        JZ6 jz6 = new JZ6();
        jz6.push(1);
        jz6.push(2);
        System.out.println(jz6.pop());
        System.out.println(jz6.pop());
    }
}
