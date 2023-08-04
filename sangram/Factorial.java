//input a number and print its factorial
import java.util.Scanner;
public class Factorial {
  public static void main(String[] args) {
    System.out.println("Factorial");
    Scanner input = new Scanner(System.in);
    System.out.print("Input a number : ");
    int n = input.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++){
      fact*=i;
    }
    System.out.println("The factorial of "+n+" is "+fact);
  }
}