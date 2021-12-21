package com.company;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int NUM_OF_STUDENTS = 3;
        final int NUM_OF_GRADES = 2;
        double grade=0, avg=Integer.MAX_VALUE, avg_min=Double.MAX_VALUE, sum=0;

        for (int i = 0; i < NUM_OF_STUDENTS; i++) {
            avg = 0;
            sum = 0;
            for (int j = 0; j < NUM_OF_GRADES; j++) {
                System.out.println("please enter the "+(j+1)+ " grade: ");
                grade = s.nextDouble();
                sum += grade;
            }
            avg = sum/NUM_OF_GRADES;

            if(avg<avg_min){
                avg_min = avg;
            }

        }
        System.out.println(avg_min);
    }
}

