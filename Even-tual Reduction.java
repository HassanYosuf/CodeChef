/* link to the problem
https://www.codechef.com/problems/EVENTUAL */

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
		int t=0;
		
		try {
		    t=in.nextInt();
		    
		} catch(Exception e) {}
		
		while(t>0)
		{
		    int n=0;
		    String s="";
		    try {
		         n = in.nextInt();
		         while(s.isEmpty())
		            s = in.nextLine();
		    } catch(Exception e){}
		   
		    boolean f = true;
		    int[] freq=new int[26];
		    for(int i=0;i<26;i++)
		    freq[i]=0;
            
		    s=s.toLowerCase();
		    for(int i = 0;i<n;i++)
		    {
		        int ascii = ((int)s.charAt(i))-97;
		        freq[ascii]++;
		    }
		    for(int i=0;i<26;i++)
		    {
		        if(freq[i]%2!=0)
		        {
		            f = false;
		            break;
		        }
		    }
		    
		    if(f == true)
		    System.out.println("YES");
		    else
		    System.out.println("NO");

		    t--;
		}
		
	}
}
