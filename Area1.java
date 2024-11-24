import java.util.Scanner;
 class Rectangle {

static final float h = 5.5f;

Rectangle( float a, float b){
float getArea= a*b;
System.out.println(getArea);   
}
        
Rectangle(float len, float br, float h2) {
    float getVolume = len*br*h;
    System.out.println(getVolume);
}



public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length");
    float len = sc.nextFloat();
    System.out.println("Enter the breadth");
    float br = sc.nextFloat();
    sc.close();

    Rectangle r1 = new Rectangle(len, br);
    Rectangle r2 = new Rectangle(len, br, h);
    
}
    }

