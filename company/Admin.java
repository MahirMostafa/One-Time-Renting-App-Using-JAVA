package com.company;
 import java.util.*;
public class Admin {
    private char v1;
    private char v2;
    private char v3;
    private char v4;
    private char v5;
    private String id;

    public void getidVerification(String id)
    {
        this.id = id;
        idgenerator();
    }

    public void setV1(char v1) {
        this.v1 = v1;
    }

    public void setV2(char v2) {
        this.v2 = v2;
    }

    public void setV3(char v3) {
        this.v3 = v3;
    }
    public void setV4(char v4) {
        this.v4 = v4;
    }

    public void setV5(char v5) {
        this.v5 = v5;
    }
    public char getV1() {
        return v1;
    }
    public char getV2() {
        return v2;
    }
    public char getV3() {
        return v3;
    }
    public char getV4() {
        return v4;
    }
    public char getV5() {
        return v5;
    }
    public String getId()
    {
        return id;
    }
    public void idgenerator()
    {
        try
        {

            char[] array=getId().toCharArray();
            setV4(array[0]);
            setV5(array[1]);
            setV1(array[2]);
            setV2(array[8]);
            setV3(array[9]);
        }
        catch(NumberFormatException e){
            System.out.println("App Id is Not created");
        }
    }

    public void Verification()
    {
        if (getId().length()!=10)
        {

            System.out.println("This User Aiub Id is Not valid.");
        }
        else{
            if(getV1()=='-')
            {
                if (getV2()=='-')
                {
                    if(getV3()=='1'||getV3()=='2'||getV3()=='3')
                    {
                        if(getV4()=='1')
                        {
                            if(getV5()>='6'&&getV5()<='9') {
                                System.out.println("This User Aiub Id is valid.");
                            }
                            else {
                                System.out.println("This User Aiub Id is Not valid.");}
                        }
                        else if(getV4()=='2')
                        {
                            if(getV5()=='0')
                            {
                                System.out.println("This User Aiub Id is valid.");
                            }
                            else {
                                System.out.println("This User Aiub Id is Not valid.");
                            }

                        }
                        else {

                            System.out.println("This User Aiub Id is Not valid.");
                        }

                    }
                    else {
                        System.out.println("This User Aiub Id is Not valid.");
                    }
                }
                else {
                    System.out.println("This User Aiub Id is Not valid.");
                }
            }
            else {
                System.out.println("This User Aiub Id is Not valid.");
            }
        }




    }
}
