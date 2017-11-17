package com.company.com.company.task5;

import java.util.Scanner;

public class Task5 {

    public static void Start(){
        System.out.println("Input size of matrix");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] matrix = new int[size][size];
        Build(matrix, size);
    }

    public static void Build(int[][] inM, int size){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (i + j == size - 1  || i == j){
                    inM[i][j] = 1;
                }
                else{
                    inM[i][j] = 0;
                }
                System.out.print(inM[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Start();
    }
}
