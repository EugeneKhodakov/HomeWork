package com.company.com.company.task3;

import java.util.Scanner;

public class Task3 {

    public static void getInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input left border: ");
        double LeftBorder = in.nextDouble();
        System.out.println("Input right border: ");
        double RightBorder = in.nextDouble();
        System.out.println("Input step: ");
        double Srep = in.nextDouble();
        Function(LeftBorder, RightBorder, Srep);
    }


    public static void Function(double LeftBorder, double RightBorder, double Step){
        if (LeftBorder >= RightBorder || Step > (RightBorder - LeftBorder)) {
            System.out.println("Wrong Input");
        }
        else{
            for (double i = LeftBorder; i < RightBorder; i = i + Step){
                double FResult = (double) (Math.tan(2 * i) - 3);
                System.out.println(i + "   |  " + FResult);
                System.out.println("________________________________________");
            }
        }
    }

    public static void main(String args[]){
        getInput();
    }
}
