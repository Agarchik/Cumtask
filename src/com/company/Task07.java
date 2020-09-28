package com.company;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner inf = new Scanner(System.in);
        System.out.println("Введите число");
        int a = inf.nextInt();
        System.out.println("сумма чисел до него (вместе с ним): " + addUpTo(a));
    }
    public static int addUpTo(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++)
        {
            sum =  sum + i;
        }
        return sum;
    }
}
