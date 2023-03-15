package com.company;
import java.lang.*;
import java.util.Scanner;
class Info {
    CreateFile cf = new CreateFile();
    logIn objlog=new logIn();
    private String name;
    private String AId;
    private String pass;
    private int age;
    private String phoneNumber;
    private String gmail;
    private String city;
    Scanner ob1 = new Scanner(System.in);
    Scanner ob2 = new Scanner(System.in);
    Scanner ob3 = new Scanner(System.in);
    Admin a = new Admin();
    public void getInfo(String name, String AId,String pass,String PhoneNumber,String gmail ,String city){
        setName(name);
        setAId(AId);
        setPass(pass);
        setAge(age);
        setPhoneNumber(PhoneNumber);
        setGmail(gmail);
        setCity(city);
        String i0="name:"+name+"\nAIUB ID:"+AId+"\nPhone Number:"+PhoneNumber+"\nGmail:"+gmail+"\nCity:"+city;
        cf.writeInFileInfo(i0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAId(String AId) {
        this.AId = AId;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getAId() {
        return AId;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGmail() {
        return gmail;
    }

    public String getCity() {
        return city;
    }
    public  void TakeInfo()
    {
        System.out.println("Enter Your Name:");
        String n=ob1.nextLine();
        System.out.println("Enter Your AIUB ID :");
        String id=ob1.nextLine();
        a.getidVerification(id);
        a.Verification();
        System.out.println("Enter Your password:");
        String p=ob3.nextLine();
        try {

            System.out.println("Enter Your Age:");
            int ag = ob2.nextInt();
            setAge(ag);
        }
        catch(Exception e)
        {
            System.out.println("Please Enter Int value as age.");
            TakeInfo();
        }
        System.out.println("Enter Your Phone Number:");
        String phn=ob3.nextLine();
        System.out.println("Enter Your Gmail:");
        String gm=ob3.nextLine();
        System.out.println("Enter Your City:");
        String ct=ob1.nextLine();
        a.idgenerator();
        getInfo(n,id,p,phn,gm,ct);
        objlog.signIn(id,p);
    }
    public void ShowInfo()
    {
        cf.readFromFileInfo();
        /*System.out.println("Name:"+ getName());
        System.out.println("AIUB ID :"+ getAId());
        System.out.println("Age:"+ getAge());
        System.out.println("Phone Number:"+ getPhoneNumber());
        System.out.println("Gmail:"+ getGmail());
        System.out.println("City:"+ getCity());*/

    }

}