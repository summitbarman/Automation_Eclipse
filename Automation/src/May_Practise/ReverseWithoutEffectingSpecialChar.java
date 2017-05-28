package May_Practise;

public class ReverseWithoutEffectingSpecialChar 
{
	public static void main(String[] args) 
	{
		System.out.println(reverseString("sumit@barman#testyantra"));
	}
	public static String reverseString(String input)
	{
		char inputArray[]=input.toCharArray();
		int l=0;
		int r=inputArray.length-1;
		while(l<r)
		{
			if(!Character.isAlphabetic(inputArray[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(inputArray[r]))
			{
				r--;
			}
			else
			{
				char newChar=inputArray[l];
				inputArray[l]=inputArray[r];
				inputArray[r]=newChar;
				l++;
				r--;
			}
		}
		return new String(inputArray);
	}
}
