import java.util.Scanner;
public class Multiple1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 9: ");
    int num = sc.nextInt();
    if (num < 1 || num > 9) {
      System.out.println("Error: invalid input. Please enter a number between 1 and 9.");
    } else 
{
      for (int j = 1; j <= 10; j++) {
        System.out.println(num + " x " + j + " = " + num * j);
      }
    }
  }
}
