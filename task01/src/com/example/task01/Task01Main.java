package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        boolean b = canGetDriverLicense(18);
        System.out.println(b);
    }

    static boolean canGetDriverLicense(int age) {
        if (age >= 18)
            return true;
        else
            return false;
    }
}
