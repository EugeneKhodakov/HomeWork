package com.company.SE_02.Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JuniorSet {
    private static List<Root> rootSet = new ArrayList();

    public JuniorSet(){
        Root pencil = new Pencil("Pencil", "Kolores", 1.5, "Blue");
        Root notebook = new Paper("Copybook", "GreenIsland", 2.3, "Notebook");
        Root marker = new Marker("Marker", " GANAMARKER", 1.8, "Black", "Soy Ink", 1.1);
        Root album = new Album("Drawing album", "Bla-bla", 2.3, "Album", "A4");
        rootSet.add(pencil);
        rootSet.add(notebook);
        rootSet.add(marker);
        rootSet.add(album);
    }

    public static List<Root> getRootSet() {
        return rootSet;
    }

    public List<Root> getSortByNameRootset(){
        this.sortByName();
        return rootSet;
    }

    public List<Root> getSortByCostRootSet(){
        this.sortByCost();
        return rootSet;
    }

    public List<Root> getSortByNameAndCostRootSet(){
        this.sortByName();
        this.sortByCost();
        return rootSet;
    }

    private List<Root> sortByCost(){
        double[] sortCost = new double[rootSet.size()];
        int i = 0;
        for(Iterator var = rootSet.iterator(); var.hasNext(); ++i){
            Root a = (Root)var.next();

        }
        return rootSet;

    }

    private List<Root> sortByName(){

        return rootSet;
    }


    /* public static void main(String args[]) {
        JuniorSet a = new JuniorSet();
        for (int i = 0; i < rootSet.size(); i++){
            System.out.println(rootSet.get(i));
        }
    }*/
}
