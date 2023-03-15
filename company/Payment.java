package com.company;
import java.util.*;
public class Payment  {
    Scanner s2=new Scanner(System.in);

    public void Make_payment() {
        System.out.println("1.bkash or 2.Cash on delivery?3.Cancel order");
        Scanner obp = new Scanner(System.in);
        int p = obp.nextInt();
        if (p == 1) {
            System.out.println("Bkash number: ");
            System.out.println("Done");
        } else if (p == 2) {
            System.out.println("Cash..");
            System.out.println("Done");

        }
        else if(p == 3)
        {
            System.out.println("Your Order have been cancel Thank you");
        }
        else {
            System.out.println("Wrong key word");
        }
        System.out.println("1.Back\n2.Exit");
        int b= s2.nextInt();
        if(b==1)
        {
            logIn obl=new logIn();
            obl.TakelogInfo();
        }
        else if(b==2)
        {
            System.out.println("Thank You Have a good time");
        }
        else {
            System.out.println("Wrong key word");
        }

    }
}
