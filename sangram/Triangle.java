import java.util.Scanner;
public class Triangle {
  public static void main(String[] args) {
    System.out.println("Area of Triangle");
    Scanner input = new Scanner(System.in);
    System.out.print("Input the Base of the Triangle : ");
    float base = input.nextInt();
    System.out.print("Input the Height of the Triangle : ");
    float height = input.nextInt();
    float area = (base*height)*0.5;
    System.out.println("The Area of the Triangle is "+area+".");

    
  }
}
