package com.company;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner inf = new Scanner(System.in);
        System.out.println("Введите символ: ");
        char sym = inf.next().charAt(0);
        System.out.println("Значение ASCII: " + ctoa(sym));
    }
    public static int ctoa(char a) {
        return a;
    }
}
