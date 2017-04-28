package com.company;
import java.util.Scanner;
import java.util.*;
import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by dell on 4/22/2017.
 */
public class Registration extends TextFile
{
    public int reg_id;
    //public String Reg_type;

    public String name;      // auto generated
    public int Event_Id;      // auto generated
    public String Date;

    public String a;

    Scanner scan=new Scanner(System.in);
    public Registration()
    {
        System.out.println();
        System.out.println(" REGISTRATION FORM" );
        System.out.println();
    }

    public void ClientInfo() {
        System.out.println("Enter Your Information !!!");
        System.out.println();
        System.out.println("Name :");
        //scan.next();
        a= scan.next();

        System.out.println("Age :");
        //scan.next();
        String b= scan.next();

        System.out.println("Contact :");
        //scan.next();
        String c= scan.next();

        System.out.println("Address :");
        //scan.next();
        String d= scan.next();
    }

    public void EventInfo()
    {
        System.out.println();
        System.out.println("Enter Event Information !!!");
        System.out.println();
        System.out.println("Event Type : ");
        scan.next();

        System.out.println("Event Date : ");
        scan.next();

        System.out.println("Venue : ");
        scan.next();

        System.out.println("Location : ");
        scan.next();

    }

    public  void EquipmentRequire()
    {
        System.out.println("There are services we providing !!!");
        System.out.println();
        System.out.println(" 1: Sound System ");
        System.out.println(" 2: Video Screen ");
        System.out.println(" 3: Decoration ");
        System.out.println(" 4: Catering ");
        System.out.println(" 5: Lodging Service ");

    }
}
