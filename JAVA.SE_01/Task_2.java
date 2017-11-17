package com.company.com.company.task2;

import java.util.concurrent.SynchronousQueue;

public class Task_2 {

    public static final double EPS = 1e-7;

    public static void FoundNumber(){
        int n = 1;
        double a = 1;
        while (a > EPS){
            a = (double) 1 / ((n + 1) * (n + 1));
            n++;
        }
        System.out.println(n);

    }
    public static void main(String args[]){
        FoundNumber();

    }
}
