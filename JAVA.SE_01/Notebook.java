package com.company.com.company.task6;

import java.util.ArrayList;
import java.util.Scanner;

public class Notebook {

    private static ArrayList<String> notes = new ArrayList<String>();

    public static void ShowAllNotes(){
        for(String notes : notes){
            System.out.println(notes);
        }
    }

    public ArrayList getNotes() {
        return this.notes;
    }

    public static void main(String args[]){

        System.out.println("Choose what you need:");
        System.out.println("1 - Add new note");
        System.out.println("2 - Delete note");
        System.out.println("3 - Edit note");
        System.out.println("4 - Show all notes");
        System.out.println("5 - Exit");
        int x = 0;
        do{
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            x = Integer.parseInt(input);
            switch (x){
                case 1: EntryNotebook.AddNote();
                break;
                case 2: EntryNotebook.DeleteNote();
                break;
                case 3: EntryNotebook.ChangeNote();
                break;
                case 4: Notebook.ShowAllNotes();
                break;
                default: System.out.println("Wrong input, try again");
                break;
                }
                in.close();
            } while (x != 5);
        }
}

class EntryNotebook {

    public static void AddNote(){
        System.out.println("Input the name");
        Notebook n = new Notebook();
        Scanner in1 = new Scanner(System.in);
        String name = in1.nextLine();
        n.getNotes().add(name);
    }

    public static void DeleteNote(){
        System.out.println("Input the number of note which you wont to delete");
        Scanner in2 = new Scanner(System.in);
        Notebook n = new Notebook();
        int id = in2.nextInt();
        n.getNotes().remove(id);
    }

    public static void ChangeNote(){
        System.out.println("Input the number of note which you want to change ");
        Notebook n = new Notebook();
        Scanner in3 = new Scanner(System.in);
        int id = in3.nextInt();
        System.out.println("Input new note");
        String input = in3.nextLine();
        n.getNotes().set(id, input);
    }
}
