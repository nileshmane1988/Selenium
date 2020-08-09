package pattern;

import java.util.Scanner;

public class Perfect_no {

	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no  here = ");
		int n=sc.nextInt();
		System.out.println("enter no is = "
+ n);		
		int sum = 0;
		for(int i= 1; i< n; i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
			}
		}
		if (n== sum)
		{
			System.out.println(n + " is s perfect no ");
		}else
		{
			System.out.println("Not a Prtfect no");
		}
		
		
		
		
		
		
		
	}
}
