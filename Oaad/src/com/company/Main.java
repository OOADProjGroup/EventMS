package com.company;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args)
    {
        Login l=new Login();
        String var=l.Login_Test();
        if(var.equals(" Client Logged In"))
        {
            Event e=new Event(l.test,l.name);
        }

        else if(var.equals("Planner Login"))
        {
            //InRead ir=new InRead();
            for(int clear = 0; clear < 1000; clear++)
            {
                System.out.println("\b") ;
            }
            try {
                System.out.println();
                FileReader fr = new FileReader("C:\\Users\\\\dell\\\\IdeaProjects\\\\Oaad\\\\src\\\\com\\\\company\\\\new.txt\\");
                BufferedReader br = new BufferedReader(fr);
                String str;
                while((str =br.readLine())!= null)
                {
                    System.out.println(str+"\n");
                }
                br.close();
            }

            catch(IOException e)
            {
                System.out.print("File not found");
            }

        }
        else
        {
            System.out.print("You have entered invalid login");
        }
        //Event e=new Event(1,"abc","12/6/18");                   // demo
    }
}
