package May_Practise;

import java.util.Scanner;

public class ReplaceWords 
{
	public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String s=ob.nextLine();

        System.out.println("Enter the word to be replaced.");
        String replace=ob.next();
        System.out.println("Enter the word with which it is to be replaced.");
        String replacewith=ob.next();
        s=s+" ";
        String newsen="";String temp="";
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x!=' ')
            {
                temp=temp+x;
            }
            else
            {
                if(replace.equals(temp))
                {
                    newsen=newsen+replacewith;
                }
                else
                {
                    newsen=newsen+temp;
                }
                newsen=newsen+" ";
                temp="";
            }
        }
        System.out.println("The new sentence is :"+"\n"+newsen);
    }
}