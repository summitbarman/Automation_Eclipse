package May_Practise;

import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word : ");
		String str=sc.nextLine();
		char[] con=str.toCharArray();
		for(int i=0;i<con.length-1;i++)
		{
			char charr=str.charAt(i);
			if(Character.isUpperCase(charr))
			{
				System.out.println("Given Characters : "+str.charAt(i)+" is a UPPER case letter");
			}
			else if(Character.isLowerCase(charr))
			{
				System.out.println("Given character : "+str.charAt(i)+" is a LOWER case letter");
			}
			else
			{
				System.out.println("Given character : "+str.charAt(i)+" is NOT UPPER/LOWER case letter");
			}
		}		
	}
}
