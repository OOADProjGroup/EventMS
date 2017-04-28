package com.company;
import java.io.File;
import java.util.Scanner;
import java.sql.*;

/**
 * Created by dell on 4/24/2017.
 */
public class Login {
    private static int m_id=  59672;
    private static int o_id=  59664;
    private static int p_id=  59658;
    private static String name_m="Hamzah";
    private static String name_o="Waleed";
    private static String name_p="Rida";
    private int id;
    public String name;
    public int test;                      //password or id
    private String username;
    private String Gender;

    public String Login_Test() {
        String test1=" ";
        Scanner scan=new Scanner(System.in);
        System.out.println();
        System.out.println("Choose Your Role");
        System.out.println();
        System.out.println("1) Manager");
        System.out.println("2) Organizer");
        System.out.println("3) Planner");
        System.out.println("4) Client");
        int a=scan.nextInt();
        if(a==1)
        {
            System.out.println("Username :");
            name=scan.next();
            System.out.println("Password :");
            test=scan.nextInt();
            if(test==m_id )
            {
                test1= "Login Successful";
                System.out.print("Login Successful");
                System.out.println();
            }
            else
            {
                test1= "Invalid Login";
                System.out.print("Invalid Login");
                System.out.println();
            }

        }
        else if(a==2)
        {
            System.out.println("Username :");
            name=scan.next();
            System.out.println("Password :");
            test=scan.nextInt();
            if(test==o_id)
            {
                test1= "Login Successful";
                System.out.print("Login Successful");
                System.out.println();
            }
            else
            {
                test1= "Invalid Login";
                System.out.print("Invalid Login");
                System.out.println();
            }
        }
        else if(a==3)
        {
            System.out.println("Username :");
            name=scan.next();
            System.out.println("Password :");
            test=scan.nextInt();
            if(test == p_id )
            {
                test1= "Planner Login";
                System.out.print("Planner Login");
                System.out.println();
            }
            else
            {
                test1= "Invalid Login";
                System.out.print("Invalid Login");
                System.out.println();
            }
        }
        else
        {
            System.out.println("Username :");
            String name=scan.next();
            System.out.println("Password :");
            int test=scan.nextInt();
            test1= " Client Logged In";
        }
        return test1;
    }

    public void Scheduling()
    {
    }
}
