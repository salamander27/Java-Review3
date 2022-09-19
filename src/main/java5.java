package main;

import java.util.Scanner;

public class java5 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        int num1 = in.nextInt();

        float sumnum = (num1 - 32) * 5/9;
        System.out.println(Math.round(sumnum));

    }
}

