package pattern;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3,4,5,1,3};
		for(int i=0;i<=arr1.length;i++) 
		{
			for(int j=i+1;j<=arr1.length-1;j++);
			{				
				if (arr1[j]==arr1[i])
				{
					System.out.print( arr1[i] + ", ");
				}
			}
		}
	}

}
