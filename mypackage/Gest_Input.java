package mypackage;
import java.io.*;
public class Gest_Input
{
    public static String leggi()
    {
       InputStreamReader inp=new InputStreamReader(System.in);
       BufferedReader stdin=new BufferedReader(inp);
       String y="";
       try
       {
       y=stdin.readLine();
       }
       catch(Exception yyy)
       {
       }
       return y;
    }  
    
    public static int randomcolore()
    { 
        int n = (int) (Math.random() * 256);
        
        return n;
    }  
    
    public static int randomgrand()
    { 
        int n = (int) (Math.random() * 1081);
        
        return n;
    }
}