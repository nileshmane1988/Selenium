package pattern;

import java.util.Scanner;

public class Prime_no_series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start range");
		int start = sc.nextInt();
		System.out.println("enter end element range");
		int end =sc.nextInt();
		
		
		for (int i=start; i <= end; i++)
		{
			int count =0;
			int no=i;
			for (int j=1 ; j<= no ; j++)
			{
				if(no %j == 0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i + " , ");
			}
		}
	}

}
