package com.company;
import java.util.*;
public class Customer  {
    Scanner obs=new Scanner(System.in);
    Item it=new Item();
    public void show()
    {
        System.out.println("Customer Info:");
        Info in=new Info();
        in.ShowInfo();
        cust();
    }
    public void cust()
    {
        System.out.println("1.view Item\n2.Return your Item:");
        int c=obs.nextInt();
        if(c==1)
        {
            it.viewItem();
            System.out.println("1.add to cart\n0.NO");
            int cm=obs.nextInt();
            if(cm==1) {
                it.Make_order();
                System.out.println("1.Confirm your order and make payment.\n2.Cancel order");
                int m=obs.nextInt();
                if(m==1)
                {
                    System.out.println("Thank you for your order\npay in:");
                    it.Make_payment();
                }
                else if(m==2)
                {
                    System.out.println("Thank you.");

                }
                else{
                    System.out.println("Wrong input");
                }
            }
            else if(cm==0)
            {
                System.out.println("OK. Thank you");

            }
            else
            {
                System.out.println("Wrong Input");
            }
        }
        else if(c==2)
        {
            System.out.println("Return Your Item");
            Owner owner=new Owner();
            owner.GetMoneyBack();
            owner.ItemReturn();


        }
        else{
            System.out.println("Wrong input");
        }


    }


}
