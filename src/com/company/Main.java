package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {11, 4, 2, 3, 11, 2, 4, 3};
	    ArrayOfNumbers array = new ArrayOfNumbers();
	    int count = array.search(arr);
        System.out.println("count = " + count);

        Chess chess = new Chess();
        chess.littleChessGame();

        Triangle triangle = new Triangle();
        triangle.square();
    }
}
