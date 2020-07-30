/* package codechef; // don't place package name! */

/*link for the Question*/
/*https://www.codechef.com/problems/PCJ18B*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t=0;
		Scanner in = new Scanner(System.in);
		try{
		   
		  t = in.nextInt();
		}catch(Exception e){}
		while(t > 0)
		{
		    int n;
		    try{
		      n = in.nextInt();
		    }catch(Exception e){break;}
		    
		    int a =0;
		    for (int i=1;i<=n ;i+=2 )
		    {
		      a = a + ((n-i+1) * (n-i+1));
		  
		    }
		        System.out.println(a);
		        t--;
	}
	    
	}
}
