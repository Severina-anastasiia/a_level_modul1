package com.company;

import java.util.Scanner;

public class Chess {
    private int[] start = {0, 0};
    private int a;
    private int b;
    private boolean end = true;

    private void position(int a, int b){
        if((Math.abs(a) == Math.abs(start[0] + 1) && Math.abs(b) == Math.abs(start[1] + 2))
                || (Math.abs(a) == Math.abs(start[0] + 2) && Math.abs(b) == Math.abs(start[1] + 1))){
            start[0] += a;
            start[1] += b;
        }
        else {
            System.out.println("You can't put the knight here");
        }
    }

    public void littleChessGame(){
        while (end){
            System.out.println("Knight's position is: " + start[0] + ", " + start[1]);
            System.out.println("1 - new position");
            System.out.println("2 - exit");
            Scanner input = new Scanner(System.in);
            int i = input.nextInt();
            switch (i){
                case 1:{
                    System.out.println("Enter position of knight, where you want to put it: ");
                    a = input.nextInt();
                    b = input.nextInt();
                    position(a, b);
                    break;
                }
                case 2: {
                    end = false;
                    break;
                }
                default:{
                    end = false;
                }
            }
        }
    }
}
