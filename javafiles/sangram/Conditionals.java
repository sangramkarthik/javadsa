package javafiles.sangram;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =  (input.nextInt());
        if(a>1){
            System.out.print("hello");

        }


        while (a>=1){
            System.out.println(+a);
            a=a-1;
        }

    }
}
