package pattern;

import java.util.Arrays;

public class StringAnagramString1 {

		public static void main(String[] args) {

			int arr1[] = {25,92,55,67,91,10,1};
			int max = arr1[0];
			for(int i=0;i < arr1.length;i ++)
			{
				if(arr1[i] > max)
				{
					max = arr1[i];
				}
			}

			System.out.println("max element :" + max);
		}
}