import java.util.Stack;
public class Stack2{
  public static void main(String[] args) {
    // Create a new stack
    Stack<Integer> stack = new Stack<>();

    // Push elements onto the stack
    stack.push(12);
    stack.push(20);
    stack.push(30);

    // Access the element at the top of the stack
    int top = stack.peek();
    System.out.println(top);  // Outputs 3

    // Pop the element at the top of the stack
    top = stack.pop();
    System.out.println(top);  // Outputs 3

    // Check if the stack is empty
    boolean isEmpty = stack.empty();
    System.out.println(isEmpty);  // Outputs false
  }
}
