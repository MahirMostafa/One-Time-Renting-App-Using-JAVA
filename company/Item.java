package com.company;
import java.util.*;
public class Item extends Payment {
    Scanner s1=new Scanner(System.in);
    CreateFile cf = new CreateFile();
    public void viewItem() {
        System.out.println("item:");
        Show();
    }

    public void add_details() {
        System.out.println("add Details");
       // CreateFile cf = new CreateFile();
        System.out.println("Item name.");
        String i1 = s1.nextLine();
        System.out.println("Item Condition ");
        String i2 = s1.nextLine();
        System.out.println("Item Rent Rate Per Day ");
        String i3 = s1.nextLine();
        String i0="name:"+i1+"\nCondition:"+i2+"\nItem Rent Rate Per Day:"+i3;
        cf.writeInFile(i0);


    }

    public void addItem() {
        System.out.println("Item add");
        Show();
    }

    public void Make_order() {
        System.out.println("Order excepted");

    }

    public void Show() {
        cf.readFromFile();
    }
}

