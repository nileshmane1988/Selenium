package pattern;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no = ");
		int n= sc.nextInt();
		int length = String.valueOf(n).length();
		System.out.println("lenght = "+ length);
		
		int r=0;
		int c=0;
		int temp=n;
		int sum = 0;
		
		while(temp != 0)
		{
			r=temp %10;
			c=r*r*r;
			sum= sum +c;
			temp = temp / 10;
		}
		if(n ==sum)
		{
			System.out.println(n + " Armstrong no ");
		}else
		{
			System.out.println("Not armstrong");
		}
	}

}
