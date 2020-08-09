package pattern;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//art,rat  moon noon,  
		String s1 = "aenr";
		String s2 ="aner";
		
		char[] charr1= s1.toCharArray();
		char[] charr2= s2.toCharArray();
		
		Arrays.sort(charr1);  //ART
		Arrays.sort(charr2);  // ART
		
		boolean b = Arrays.equals(charr1,charr2);
		
		if(b==true) 
		{
			System.out.println("String are anagram");
			
		}
		else
		{
			System.out.println("string are not anagram");
		}

	}

}
