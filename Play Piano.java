/* package codechef; // don't place package name! */
//https://www.codechef.com/problems/PLAYPIAN
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int T =0;
		Scanner in1 = new Scanner(System.in);
        try
        {
            T = in1.nextInt();
        }
        catch(Exception e){}
        while(T> 0)
        {  
            Scanner in = new Scanner(System.in);
            String p;
            try{
             p = in.nextLine();}
            catch(Exception e){break;}
            
            String op = "yes";
           for(int i=0;i<p.length();i=i+2)
             {
                  System.out.println(p.charAt(i));
                   System.out.println(p.charAt(i+1));
                   System.out.println();
                   
                 if(p.charAt(i)==p.charAt(i+1))
                 {
                     op="no";
                     break;
                 }
             }
             
            System.out.println(op);

                T--;
         
        }
    }
}
