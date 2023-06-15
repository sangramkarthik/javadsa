package javafiles.sangram;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Integer: ");
        int num1= input.nextInt();
        System.out.println("Enter the Second Integer: ");
        int num2= input.nextInt();
        int Sum = num1 + num2;
        System.out.println("The Sum of the Two Number is : "+Sum);
    }
}
