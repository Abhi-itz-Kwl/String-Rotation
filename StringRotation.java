import java.util.*;
import java.util.Scanner;

public class StringRotation
{
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    System.out.print("s1: ");
	    String s1=in.nextLine();
	    System.out.print("s2: ");
	    String s2=in.nextLine();
	    if(s1.length()!=s2.length())
	    {
	        System.out.print("No");
	        return;
	    }
	    else
	    {
	        String concat=s2+s2;
	        if(concat.contains(s1))
	            System.out.print("Yes");
	    }
	     
	     
	     
	}
}