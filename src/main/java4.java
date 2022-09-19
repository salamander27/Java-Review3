package main;

import java.util.Scanner;

public class java4 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = in.nextInt();

        System.out.print("Input your second number: ");
        int num2 = in.nextInt();

        System.out.print("Input your third number: ");
        int num3 = in.nextInt();

        int sumnum = num1+num2+num3;
        int avg = sumnum/3;

        System.out.print("Average =" + avg );

    }
}