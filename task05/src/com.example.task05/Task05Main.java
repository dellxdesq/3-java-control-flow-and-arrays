package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        System.out.println(getMin(5,4,3));

    }

    static int getMin(int a, int b, int c) {
        if (a < b && a < c)
            return a;
        else if (b < a && b < c)
            return b;
        else  if (c < a && c < b)
            return c;
        return 0;
    }
}