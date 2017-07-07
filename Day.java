import java.io.*;
import java.util.*;
public class Day
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
                String str;
        str=s.next();
      
       if(str.equals("mon")||str.equals("tue")||str.equals("wed")||str.equals("thus")||str.equals("fri")||str.equals("sat"))
       {
                   System.out.println(str+"=true");
       }
       else 
       {         
           System.out.println(str+"=false");
       }
      
    }}
