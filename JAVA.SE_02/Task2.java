package com.company.SE_02.Task2;

import java.util.ArrayList;
import java.util.List;

//Class Office

import java.util.HashSet;

public class Task2 {
    private static List<Person> personsInOffice = new ArrayList<>();

    public static List<Person> getPersonsInOffice() {
        return personsInOffice;
    }

    public static double getMeOfficeCost() {
        double OfficeSum = 0;
        for (Person p : personsInOffice) {
            OfficeSum = OfficeSum + p.SumPrice();

        }
        return OfficeSum;
    }

    public static void main(String args[]){
        Person p1 = new Person(new Things(TypeOfThings.PAPER, 350), 10);
        p1.AddThing(new Things(TypeOfThings.PAPER, 350), 10);
        Person p2 = new Person(new Things(TypeOfThings.PAPER, 350), 8);
        Person p3 = new Person(new Things(TypeOfThings.STAPLER, 50), 15);
        Person p4 = new Person(new Things(TypeOfThings.PEN, 150), 190);
        Person p5 = new Person(new Things(TypeOfThings.FOLDERS, 30), 110);

        getPersonsInOffice().add(p1);
        getPersonsInOffice().add(p2);
        getPersonsInOffice().add(p3);
        getPersonsInOffice().add(p4);
        getPersonsInOffice().add(p5);

        System.out.println("personsInOffice = " + getMeOfficeCost());

    }

}

enum TypeOfThings{
    PAPER, PEN, STAPLER, FOLDERS
}

class Person{
    private HashSet<Things> thingsSet = new HashSet<>();
    private int numberOfThings;

    public Person(Things things, int num){
        this.AddThing(things, num);
    }

    public Person AddThing(Things t, int count){
        thingsSet.add(t);
        return this;
    }

    public double SumPrice(){
        double sum = 0;
        for (Things t: thingsSet){
            sum = sum + t.getPrice();
        }
        return sum;
    }

    public int NumberOfThings(){
        numberOfThings = thingsSet.size();
        return numberOfThings;
    }

}

class Things{

    private TypeOfThings typeOfThings;
    private double price;

    public Things(TypeOfThings typeOfThings, double price){
        this.typeOfThings = typeOfThings;
        setPrice(price);
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setTypeOfThings(TypeOfThings typeOfThings){
        this.typeOfThings = typeOfThings;
    }

    public TypeOfThings getTypeOfThings(){
        return typeOfThings;
    }

}


