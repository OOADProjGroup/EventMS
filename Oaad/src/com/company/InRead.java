package com.company;
import java.io.*;
import java.lang.System.*;
import java.io.FileReader;

/**
 * Created by dell on 4/28/2017.
 */
public class InRead {
    public static void main(String[] args)
    {
        try {
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
}
