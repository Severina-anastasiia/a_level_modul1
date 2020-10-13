package com.company;

import java.util.Arrays;

public class ArrayOfNumbers {

    public int search(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < arr.length;) {
            int temp = 0;
            while (++i < arr.length && arr[i] == arr[i - 1]) {
                temp++;
            }
            if (temp != 0) {
                count += temp + 1;
            }
        }
        return arr.length - count;
    }
}
