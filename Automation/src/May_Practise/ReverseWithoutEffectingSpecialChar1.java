package May_Practise;

import java.util.Scanner;

public class ReverseWithoutEffectingSpecialChar1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to Reverse : ");
		String input=sc.nextLine();
		char[] inputArr=input.toCharArray();
		int l=0;
		int r=inputArr.length-1;
		while(l<r)
		{
			if(!Character.isAlphabetic(inputArr[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(inputArr[r]))
			{
				r--;
			}
			else
			{
				char tempChar=inputArr[l];
				inputArr[l]=inputArr[r];
				inputArr[r]=tempChar;
				l++;
				r--;
			}
		}
		System.out.println(new String(inputArr));
	}
}
