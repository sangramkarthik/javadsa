import java.util.Scanner;
public class Greet {
  public static void main(String[] args) {
    System.out.print("start , Input your name : ");
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
    System.out.println("Ram Ram "+name);
  }
}
