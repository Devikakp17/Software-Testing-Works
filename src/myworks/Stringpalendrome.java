package myworks;

import java.util.Scanner;

public class Stringpalendrome {
	public static void main(String[]args) {
		
	Scanner sc=new Scanner(System.in);{
		System.out.println("enter a string");
	
String s=sc.next();//hello
String temp=s;
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
 rev=rev+s.charAt(i);//olleh
}
System.out.println(rev);
if(rev.equals(temp))
{
	System.out.println("paliandrome");
}
else
{
	System.out.println("not palindrome");
}

	}



 
		

	}

	}
