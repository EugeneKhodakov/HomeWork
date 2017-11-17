package com.company.com.company.task4;

import java.util.Scanner;

public class Task4 {

    public static void Start(){
        System.out.println("Input number of elements");
        System.out.println("Input numbers it must be an even number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] MasA = new int[num];
        System.out.println("Input elements");
        for (int i = 0; i < num; i++){
            MasA[i] = in.nextInt();
        }
        int max = MasA[1];
        for (int i = 0; i < num / 2; i++){
            max = MAX(MasA[i] + MasA[num - i - 1], max);
        }
        System.out.println(max);
    }

    public static int MAX(int a, int b){
        int max = 0;
        if (a >= b) {
            max = a;
        }
        if (a < b){
            max = b;
        }
        return max;
    }

    public static void main(String args[]){
        Start();
    }
}
