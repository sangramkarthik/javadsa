import java.util.Scanner;
public class Triangle {
  public static void main(String[] args) {
    System.out.println("Area of Triangle");
    Scanner input = new Scanner(System.in);
    System.out.print("Input the Base of the Triangle : ");
    double base = input.nextDouble();
    System.out.print("Input the Height of the Triangle : ");
    double height = input.nextDouble();
    double area = (base*height)/2;
    System.out.println("The Area of the Triangle is "+area+".");

    
  }
}
