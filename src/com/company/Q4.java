package com.company;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = s.nextInt();
        int x = num%10;
        int count_x =0, length_num=0;

        while (num > 0){
            length_num++;
            if(num%10==x)
                count_x++;
            num /= 10;
        }
        if(x == length_num)
            System.out.println("identical");
        else
            System.out.println("not ");
    }
}
