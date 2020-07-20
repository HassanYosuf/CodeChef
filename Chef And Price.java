//https://www.codechef.com/problems/PRICECON

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner in = new Scanner(System.in);

		 int T = 0;
		 try
		 {
		     T = in.nextInt();
		 }
		 catch(Exception e){}
		 
		 while(T>0)
		 {
		     int loss  = 0;
		     try{
		     int N = in.nextInt();
		     int K = in.nextInt();
		  //   ArrayList P= new ArrayList();
		     while(N>0)
		     {
		         int temp = in.nextInt();
		         if(temp>K)
		         {
		             loss+=(temp-K);
		         }
		         N--;
		     }
		     }catch(Exception e){}
		     System.out.println(loss);
		  T--;   
		 }
	}
}
