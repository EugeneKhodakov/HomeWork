package com.company.SE_02.Task1;

// Class Pen

public class Task1 {

    private String penType = "Gelly";
    private String color = "Blue";

    public Task1(String penType, String color){
        this.penType = getPenType();
        this.color = getColor();
    }

    public String getPenType() {
        return penType;
    }

    public String getColor() {
        return color;
    }

    public void setPenType(String penType) {
        this.penType = penType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String out = "Type - " + this.getPenType() + ", Ink - " + this.getColor();
        return out;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Task1 other = (Task1) obj;
        if (penType != other.penType){
            return false;
        }
        if (color != other.color){
            return false;
        }
        return true;
    }


    @Override
    public int hashCode(){
        int result = 1;
        int prime = 31;
        result = prime * result + ((this.getColor() == null) ? 0 : this.getColor().hashCode());
        result = prime * result + ((this.getPenType() == null) ? 0 : this.getPenType().hashCode());
        return result;
    }

    public static void main(String args[]) {
        // ...
    }
}
