package pattern;

import java.util.Arrays;

public class StringAnagramString {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	//art,rat  moon noon,  
			String s1 = "HE is ANmol";
			String s2 ="is he anMOL";
			
			s1= s1.replace(" ", "");
			s2= s2.replace(" ", "");
			
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
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

