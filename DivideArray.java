import java.io.*;
import java.util.*;
public class DivideArray
{
    public static void main(String args[])
    {
       int i,temp1=0,temp2=0,avg1=0,avg2=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       int a[]=new int[n];
       int b[]=new int[n/2+1];
       int c[]=new int[n/2];
       for(i=0;i<n;i++)
       {
           a[i]=s.nextInt();
       }
        
        System.arraycopy(a, 0, b, 0,( n-(n/2)));
        System.arraycopy(a,(n/2+1),c,0,((n/2)));
        for(int k:b)
        {
            System.out.println(k);
        }
      for(int l:c)
        {
            System.out.println(l);
       }
            for(i=0;i<b.length;i++)
        {
            temp1=temp1+b[i];
            avg1=temp1/b.length;
        }
             
            for(i=0;i<c.length;i++) 
            {
                temp2=temp2+c[i];
               avg2=temp2/c.length;
            }
            
            if(avg1==avg2)
            {
               System.out.print("["); 
               for(i=0;i<b.length;i++)
               {
               System.out.print(b[i]);
            }
             System.out.print("]");
                System.out.print("[");
                for(i=0;i<c.length;i++)
               {
                 System.out.print (c[i]);  
                }
               System.out.print("]");
            }
            else
                  System.out.println("not possible");
    }
}

                   
       
