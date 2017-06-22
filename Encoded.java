import java.io.*;
import java.util.*;
public class Encoded
{
    public static void main(String args[])
    {int i;
        Scanner s=new Scanner(System.in);
        String w=s.next();
        String e=s.next();
        int n=w.length();
        int m=e.length();
        char ch[]=w.toCharArray();
        char dh[]=e.toCharArray();
        int a[]=new int[n];
        int b[]=new int[n];
        int d[]=new int[m];
        int f[]=new int[m];
        char c[]=new char[n];
        char h[]=new char[m];
        for(i=0;i<n;i++)
        {
             a[i]=(int)ch[i];
        }
        for(i=0;i<n;i++)
        {
            b[i]=a[i]+10;
        }
            for(i=0;i<n;i++)
            {
              c[i]=(char)b[i];  
            
        System.out.print(c[i]);
            }
            System.out.println(" ");
            
         
            System.out.print(dh[0]);
            
            
          
          for(i=1;i<m-1;i++)
          {
              d[i]=(int)dh[i];
          }
          for(i=1;i<m-1;i++)
          {
              f[i]=d[i]+10;
          
          if(f[i]>122)
          {
              f[i]=f[i]-122;
              f[i]=96+f[i];
          }
          
              h[i]=(char)f[i];
              System.out.print(h[i]);
          
          }
          
              
              
              System.out.print(dh[m-1]);
          
    }
}
