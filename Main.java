package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("the fight");
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        double b=in.nextDouble();
        double div=a/b;
        System.out.println("the division of a and b is: "+div);
    }
}
