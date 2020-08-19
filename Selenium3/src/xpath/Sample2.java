package xpath;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> ref1=new ArrayList<Integer>();
		
		ref1.add(100);
		ref1.add(20);
		ref1.add(150);
		ref1.add(60);
		System.out.println("*********Before Sorting*******");
		System.out.println(ref1);
		/*Collections.sort(ref1);
		System.out.println("*********After Sorting*******");
		System.out.println(ref1);*/
		
		Set<Integer> s=new TreeSet<Integer>();
		
		Integer a = ref1.get(0);
		s.add(a);
		Integer b = ref1.get(1);
		s.add(b);
		Integer c = ref1.get(2);
		s.add(c);
		Integer d = ref1.get(3);
		s.add(d);
		System.out.println(s);
		
		

	}

}
