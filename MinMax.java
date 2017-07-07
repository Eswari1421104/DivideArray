import java.io.*;
import java.util.*;
public class MinMax
{
static void rearrange(int arr[], int n)
{
    
    int temp[]=new int[n];
    int small=0, large=n-1;
    boolean flag = true;
         for (int i=0; i<n; i++)
    {
        if (flag)
            temp[i] = arr[large--];
        else
            temp[i] = arr[small++];
 
        flag = !flag;
    }
 
    for (int i=0; i<n; i++)
        arr[i] = temp[i];
}
 
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
            int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        rearrange(arr,n);
    
        for(int i=0;i<n;i++)
        System.out.print(" "+arr[i]);
        
       
}
    }
