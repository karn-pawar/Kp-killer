package com.company;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your physics marks:");
        int Physics= scan.nextInt();
        System.out.println("Enter your English marks:");
        int English= scan.nextInt();
        System.out.println("Enter your Chemistry marks:");
        int Chemistry= scan.nextInt();
        System.out.println("Enter your Mathematics marks:");
        int Mathematics= scan.nextInt();
        System.out.println("Enter your Computer marks:");
        int Computer= scan.nextInt();
        float percentage=((Physics+English+Chemistry+Mathematics+Computer)/5);
        System.out.println("percentage");
        System.out.println(percentage);
    }
}
