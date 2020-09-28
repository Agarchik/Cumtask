package com.company;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner inf = new Scanner(System.in);
        System.out.println("Введидте основание треугольника: ");
        int a = inf.nextInt();
        System.out.println("Введите его высоту: ");
        int h = inf.nextInt();
        System.out.println("Площадь данного треугольника равна: " + ploshad(a,h));
    }
    public static int ploshad(int a, int h)
    {
        return (a * h) / 2;
    }
}
