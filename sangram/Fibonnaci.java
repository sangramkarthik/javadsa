//program to input a number and print its fibonnaci serie
import java.util.Scanner;
public class Fibonnaci {
  public static void main(String[] args) {
    System.out.println("Fibonnaci Series");
    Scanner input = new Scanner(System.in);
    System.out.print("Input a number : ");
    int n = input.nextInt();
    int a=0,b=1,c;
    System.out.print(a+" "+b);
    for(int i=0;i<n-2;i++){
      c=a+b;
      System.out.print(" "+c);
      a=b;
      b=c;
    }
  }
}