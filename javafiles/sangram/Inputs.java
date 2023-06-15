package javafiles.sangram;

import javax.naming.Name;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name : ");
        String name = input.nextLine();
        System.out.println("Please Enter some Input :");
        int roll_no = input.nextInt();
//        System.out.println("Your roll_no is : " +roll_no);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Your Name is"+name);
        System.out.println("Your Name is: "+name+"  And "+"Your Roll number is: "+roll_no);


    }
}
