package com.company;
//import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CreateFile {
    File fileObj = new File("Item.txt");
        public void writeInFile(String s)
        {
            try
            {
                if (fileObj.createNewFile()) {

                    FileWriter writer = new FileWriter(fileObj, true);
                    writer.write(s+"\r"+"\n");
                    writer.flush();
                    writer.close();

                    System.out.println("Details: \n" + fileObj.getName());
              } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        public void readFromFile()
        {
            try {
                Scanner myReader = new Scanner(fileObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }




    File fileObjinfo = new File("User Info.txt");
    public void writeInFileInfo(String s)
    {
        try
        {
            if (fileObjinfo.createNewFile()) {
                //to write in a file
                FileWriter writer = new FileWriter(fileObjinfo, true);
                writer.write(s+"\r"+"\n");
                writer.flush();
                writer.close();

                System.out.println("Details" + fileObjinfo.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void readFromFileInfo()
    {
        try {
            Scanner myReader = new Scanner(fileObjinfo);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
        }


