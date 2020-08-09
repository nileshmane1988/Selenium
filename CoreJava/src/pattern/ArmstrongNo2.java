package pattern;

import java.util.Scanner;

public class ArmstrongNo2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no = ");
		int n= sc.nextInt();
		int power = new Integer(n).toString().length();
		System.out.println("power = "+ power);
		
		int r=0;
		int c=0;
		int temp=n;
		int sum = 0;
		
				
		while(temp != 0)
		{
			/*
			 * r=temp %10; c=r*r*r; sum= sum +c; temp = temp / 10;
			 */
			c=1;
			int digit = temp %10;
			temp = temp /10;
			for(int j=1;j<=power;j++) {
				c = c * digit;
			}
			sum = sum + c;
		}
		if(n ==sum)
		{
			System.out.println(n + "is a Armstrong no ");
		}else
		{
			System.out.println("Not armstrong");
		}
	}

}
