//input three numbers and print the largest
import java.util.Scanner;
public class Big {
  public static void main(String[] args) {
    System.out.println("Largest of three numbers");
    Scanner input = new Scanner(System.in);
    System.out.print("Input the first number : ");
    int a = input.nextInt();
    System.out.print("Input the second number : ");
    int b = input.nextInt();
    System.out.print("Input the third number : ");
    int c = input.nextInt();
    if(a>b && a>c){
      System.out.println(a+" is the largest");
    }
    else if(b>a && b>c){
      System.out.println(b+" is the largest");
    }
    else{
      System.out.println(c+" is the largest");
    }
  }
}