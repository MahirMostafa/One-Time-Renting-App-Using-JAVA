package com.company;
import java.util.*;
public class Owner extends Return {
    Item it=new Item();
    public void show()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("This is Owner");

        System.out.println("Add Your Item............................");
        it.add_details();
        it.addItem();
        System.out.println("1.Go to Customer page...\n2.View Your Item details.3.Exit");
        int i = s1.nextInt();
        switch (i) {
            case 1 -> {
                Customer c = new Customer();
               c.cust();
            }
            case 2 -> it.Show();
            case 3 -> System.out.println("Thank you have a good time");
            default -> System.out.println("Sorry wrong input");
        }
    }
   public void ItemReturn()
    {

        System.out.println("Your details: ");
        Info in=new Info();
        in.ShowInfo();
        System.out.println("Your Item details: ");
        it.Show();
        System.out.println("Get your payment by: ");
        it.Make_payment();

    }

}
