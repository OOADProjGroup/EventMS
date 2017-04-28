package com.company;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import sun.rmi.transport.Connection;

/**
 * Created by dell on 4/26/2017.
 */
public class DatabaseConn {
    private static Connection con;

    public static void OpenConnection()
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //DriverManager.registerDriver(new sun.jdbc.odbc.JbdcOdbcDriver());
            con=DriverManager.getConnection("jdbc:odbc:Login_role");
            Statement st=con.createStatement();
            st.executeUpdate("insert into login_DB values ('Other','12345')");
            String s="select * from login_DB";
            ResultSet rs=st.executeQuery(s);

            JOptionPane.showMessageDialog(null,"Connected !!! ");
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
    }
    public static void main(String[] args)
    {
        //JOptionPane.showMessageDialog(null,"Connected !!! ");

        //OpenConnection();
    }

    public  static  Connection GetConnection()
    {
        return con;
    }
}

