package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 10;
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {
        long result = 1;
        if (arr.length == 0)
            return 0;
        else
        {
            for (int i = 0; i < arr.length; i++){
                result = result * arr[i];
            }
        }
        return result;
    }

}