import java.util.Scanner;
public class Circle {
  public static void main(String[] args) {
    System.out.println("Area of Circle");
    Scanner input = new Scanner(System.in);
    System.out.print("Input , the Radius of circle : ");
    float r = input.nextFloat();
    System.out.println("The Area of the Circle is "+(r*r*3.14));


  }
}
