package com.company;
import java.io.*;
import java.lang.System.*;
/**
 * Created by dell on 4/28/2017.
 */



public class TextFile extends InRead
{
    public static void main(String[] args)
    {
        try
        {
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\dell\\IdeaProjects\\Oaad\\src\\com\\company\\new.txt"));
            //bw.write("Hello");
            bw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
    }
}
