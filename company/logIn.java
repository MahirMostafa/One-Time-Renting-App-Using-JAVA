package com.company;
import java.util.*;

public class logIn {
    Scanner s1=new Scanner(System.in);
    Scanner s2=new Scanner(System.in);
    Customer cus=new Customer();
    Owner own=new Owner();
    private String AId;
    private String pass;
    private String sAId="20-41870-1";
    private String spass="2";
    public void setAId(String AId) {
        this.AId = AId;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getAId() {
        return AId;
    }
    public String getPass() {
        return pass;
    }

    public void setsAId(String sAId) {
        this.sAId = sAId;
    }
    public void setsPass(String spass) {
        this.spass = spass;
    }
    public String getsid() {
        return sAId;
    }
    public String getsp() {
        return spass;
    }
    public void TakelogInfo()
    {
        System.out.println("Enter Your Aiub Id");
        String i = s1.nextLine();
        setAId(i);
        System.out.println("Enter Your password");
        String p = s1.nextLine();
        setPass(p);
        loginVerification();

    }
    public void signIn(String a,String b) {
        setsAId(a);
        setsPass(b);
    }
    public void loginVerification() {
      if(getAId().equals(getsid()))
        {
            if(getPass().equals(getsp()))
            {
                System.out.println("Login Done");
                System.out.println("1.Do you want to take rent?");
                System.out.println("2.Do you want to give rent?");
                int c=s2.nextInt();
                if(c==1)
                {
                    cus.show();

                }
                else if(c==2)
                {
                    own.show();
                }
                else {
                    System.out.println("Wrong Input");
                }
            }
            else{System.out.println("Wrong password");}
        }
        else{System.out.println("Wrong Id");
        }

    }
}
