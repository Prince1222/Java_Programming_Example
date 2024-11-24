import java.util.Scanner;
import java.util.Stack;

public class Stack1{
  public static void main(String[] args) {
    // Create a stack of integers
    Stack<Integer> stack = new Stack<>();

    // Read integers from the user and push them onto the stack
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a series of integers, type 'done' to stop:");
    while (true) {
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("done")) {
        break;
      }
      int num = Integer.parseInt(input);
      stack.push(num);
    }

    // Pop the integers from the stack and print them
    System.out.println("The integers in reverse order are:");
    while (!stack.empty()) {
      int num = stack.pop();
      System.out.println(num);
    }
  }
}