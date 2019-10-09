package com.kamaldwip.coding.factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int input;
        System.out.println("Enter the input number");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        System.out.println("Factorial of "+input+" calculated iteratively is : "+ factorialIterative(input));
        System.out.println("Factorial of "+input+" calculated recursively is : "+ factorialRecursive(input));
    }

    private static long factorialIterative(int input) {
        long factorial = 1;
        if(input == 0 || input == 1){
            return 1;
        }
        for(int i = 1;i<=input;i++){
            factorial = factorial * i;
        }
        return factorial;

    }

    private static long factorialRecursive(int input) {
        long factorial;
        if(input == 0 || input == 1){
            return 1;
        }
        factorial = input * factorialRecursive(input -1);
        return factorial;
    }

}
