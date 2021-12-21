package com.company;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int NUM_OF_STUDENTS = 20;
        final int NUM_OF_GRADES = 9;
        double grade=0, avg=0, avg_min=Integer.MAX_VALUE, sum=0;

        for (int i = 0; i < NUM_OF_STUDENTS; i++) {
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

