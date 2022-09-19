package main;

import java.util.Scanner;

public class java3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = in .nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}