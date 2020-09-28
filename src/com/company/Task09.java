package com.company;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        Scanner inf = new Scanner(System.in);
        System.out.println("Введите число элемментов массива: ");
        int n = inf.nextInt();
        int arr[] = new int[n];
        System.out.println("Введите элементы: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = inf.nextInt();
        }
        System.out.println("Сумма кубов каждого элемента массива: " + sumOfCubes(arr,n));
    }
    public static int sumOfCubes(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + a[i] * a[i] * a[i];
        }
        return sum;
    }
}
