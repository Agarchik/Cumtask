package com.company;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        Scanner inf = new Scanner(System.in);
        System.out.println("Введидте первое число: ");
        int a = inf.nextInt();
        System.out.println("Введите второе число: ");
        int b = inf.nextInt();
        System.out.println("Введите третье число: ");
        int c = inf.nextInt();
        System.out.println("числа " + a + " и " + b + " " + operation(a,b,c) + " получить " + c);

    }
    public static String operation(int a, int b, int c)
    {
        if ( a + b == c) {
            return "сложить чтобы";
        }
        else if (a / b == c) {
            return "разделить чтобы";
        }
        else if (a * b == c) {
            return "умножить чтобы";
        }
        else if (a - b == c) {
            return "вычесть чтобы";
        }
        else {
            return "никак не могут";
        }

    }
}
