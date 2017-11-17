package com.company.SE_02.Task3;

public class Task3_Main {
    public static void main(String args[]){
        Root s = new Root() {
            protected String test() {
                return "test";
            }
        };
        System.out.println(s.getName());
    }

}

class Root{
    private String label = "";
    private String name = "";
    private double cost = 0;

    public Root(){ }

    public Root(String label, String name, double cost){
        this.label = label;
        this.name = name;
        this.cost = cost;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public double getCost(){
        return cost;
    }
}


class Pencil extends Root{

    private String color = "Blue";

    public Pencil(String name, String label, double cost, String color){
        super(label, name, cost);
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

abstract class Pen extends Pencil{

    private String oilType = "Gel";

    public Pen(String name, String label, double cost, String color, String oilType){
        super(label, name, cost, color);
        this.oilType = oilType;
    }

    public void setOilType(String oilType){
        this.oilType = oilType;
    }

    public String getOilType(){
        return oilType;
    }
}


class Marker extends Pen{

    private double lineWidth = 1.5;

    public Marker(String name, String label, double cost, String color, String oilType, double lineWidth){
        super(name, label, cost, color, oilType);
        this.lineWidth = lineWidth;
    }

    public void  setLineWidth(double lineWidth){
        this.lineWidth = lineWidth;
    }

    public double getLineWidth() {
        return lineWidth;
    }
}

class Paper extends Root{

    private String type = "type";

    public Paper(String name, String label, double cost, String type){
        super(label, name, cost);
        this.type = type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Album extends Paper{

    private String size = "size";

    public Album(String name, String label, double cost, String type, String size){
        super(name, label, cost, type);
        this.size = size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}