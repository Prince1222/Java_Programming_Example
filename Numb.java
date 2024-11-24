import java.util.Scanner;
public class Numb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9: ");
        int num = sc.nextInt();
        if (num < 1 || num > 9) {
          System.out.println("Error: invalid input. Please enter a number between 1 and 9.");
        } else 
    {
          for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
          }
        }
    }
}
