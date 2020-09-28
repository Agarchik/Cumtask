package com.company;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Введите а");
        int a = myObj.nextInt();
        System.out.println("Введите b");
        int b = myObj.nextInt();
        System.out.println("Остаток от деления " + a + " и " + b + ": " +remainder(a, b));
    }
    public static int remainder(int a, int b){
        int c = a % b;
        return c;
    }
}
