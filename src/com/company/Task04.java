package com.company;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner inf = new Scanner(System.in);
        System.out.println("Введидте аргумент prob: ");
        int prob = inf.nextInt();
        System.out.println("Введите аргумент prize: ");
        int prize = inf.nextInt();
        System.out.println("Введите аргумент pay: ");
        int pay = inf.nextInt();
        System.out.println("Всего ног: " + profitableGamble(prob,prize,pay));
    }
    public static boolean profitableGamble(int prob, int prize, int pay)
    {
        if (prob * prize > pay) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
