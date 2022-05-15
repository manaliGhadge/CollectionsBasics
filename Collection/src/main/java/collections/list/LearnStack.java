package collections.list;

import java.util.Stack;

public class LearnStack {
    // Last In First Out datatype
    // push, pop operations.

    public static void main(String args[]) {
        Stack<String> stack = new Stack();

        // push()
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("E");
        stack.push("F");

        System.out.println(stack);

        // peek() // shows latest data.
        System.out.println("Peek:" +stack.peek());

        // pop() // will remove latest element.
        stack.pop();
        System.out.println(stack);

        System.out.println("Peek:" +stack.peek());
    }
}
