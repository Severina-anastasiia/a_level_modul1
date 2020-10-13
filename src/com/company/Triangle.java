package com.company;

import java.util.Scanner;

public class Triangle {

    private int[] a = new int[2];
    private int[] b = new int[2];
    private int[] c = new int[2];

    public void square(){
        point();
        int x1 = a[0] - c[0];
        int x2 = a[1] - c[1];
        int x3 = b[0] - c[0];
        int x4 = b[1] - c[1];
        System.out.println("Square = " + Math.abs(x1 * x4 - x2 * x3) / 2);
    }

    private void point(){
        System.out.println("Enter the point A: ");
        Scanner input = new Scanner(System.in);
        a[0] = input.nextInt();
        a[1] = input.nextInt();
        System.out.println("Enter the point B: ");
        b[0] = input.nextInt();
        b[1] = input.nextInt();
        System.out.println("Enter the point C: ");
        c[0] = input.nextInt();
        c[1] = input.nextInt();
    }
}
