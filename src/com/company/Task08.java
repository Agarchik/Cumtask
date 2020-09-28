package com.company;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        Scanner inf = new Scanner(System.in);
        System.out.println("Введите первую сторону: ");
        int a = inf.nextInt();
        System.out.println("Введите вторую сторону: ");
        int b = inf.nextInt();
        System.out.println("Максимальная длина третьего ребра: " + nextEdge(a,b));
    }
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }
}
