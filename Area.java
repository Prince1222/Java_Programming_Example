import java.util.Scanner;

   
class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        Rectangle rect = new Rectangle(length, breadth);
        double area = rect.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}

 class Rectangle {
     double length;
     double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return this.length * this.breadth;
    }
}


