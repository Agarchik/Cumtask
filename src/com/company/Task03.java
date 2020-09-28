package com.company;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner inf = new Scanner(System.in);
        System.out.println("Введидте сколько куриц: ");
        int chic = inf.nextInt();
        System.out.println("Введите сколько коров: ");
        int cow = inf.nextInt();
        System.out.println("Введите сколько свиней: ");
        int pig = inf.nextInt();
        System.out.println("Всего ног: " + legs(chic, cow,pig ));
    }
    public static int legs(int chi, int cow, int pig)
    {
        return chi * 2 + cow * 4 + pig * 4;
    }
}
