package com.company;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner inf = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = inf.nextInt();
        System.out.println("Введите количество повторений сложения: ");
        int pov = inf.nextInt();
        System.out.println("Выведите делитель");
        int del = inf.nextInt();
        System.out.println("Число делится на делитель - "  + abcmath(a, pov, del));
    }
    public static boolean abcmath(int a, int b , int c) {

        for(int i = 0; i < b; i++)
        {
            a = a + a;
        }
        if (a % c == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
