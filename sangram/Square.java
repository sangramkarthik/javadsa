import java.util.Scanner;
public class Square {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input the Length of the Side of the Square : ");
    int side = input.nextInt();
    System.out.println("The Area of the Square is "+(side*side)+".");

  }
}
