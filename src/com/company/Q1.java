package com.company;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1=0, num2=0;
        char tav = 0;
        System.out.println("please enter the 1st number: ");
        num1 = s.nextInt();
        System.out.println("please enter 2nd number: ");
        num2 = s.nextInt();
        System.out.println("please enter a char: ");

        tav = s.next().charAt(0);
        if(tav == '+'){
            System.out.println("sum= "+(num1+num2));
        }
        else if(tav == '*'){
            System.out.println("multiplication= "+(num1*num2));
        }
        else{
            System.out.println("error!!!!!!!");
        }
    }
}
