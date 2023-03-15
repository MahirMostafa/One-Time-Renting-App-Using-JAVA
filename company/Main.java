package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Info objInfo = new Info();
        logIn obl=new logIn();
        Scanner s1=new Scanner(System.in);
        System.out.println("******Welcome to OTR******");
        System.out.println("******Here You can give and take product******");
        System.out.println("1.Log In");
        System.out.println("2.SignUp");
        int i=s1.nextInt();
        if(i==1)
        {
            obl.TakelogInfo();
        }
        else if(i==2)
        {
            objInfo.TakeInfo();
            System.out.println("Id have been created. \nNow log in");
            obl.TakelogInfo();
        }
        else {
            System.out.println("Wrong Key word.\nprass 1 or 2");
        }

       // objInfo.ShowInfo();

    }
}
