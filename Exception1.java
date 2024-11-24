public class Exception1 {
    public static void main(String[] args) {
        try {
            // Call a method that might throw an exception
            divide(10, 0);
          } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Division by zero is not allowed.");
            throw e;  // Rethrow the exception
          } finally {
            // This block is always executed, regardless of whether an exception is thrown or not
            System.out.println("Finally block executed.");
          }
        }
      
        public static int divide(int a, int b) {
          // Divide a by b and return the result
          return a / b;
        }
    }      