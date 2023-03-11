package Cpllections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("mahesh");
		set1.add("Waran");
		set1.add("venu");
		set1.add("thanu");
		set1.add("mahesh");
	
		System.out.println("The set is " + set1);
		
		
		TreeSet<String> set2 = new TreeSet<String>();
		
		set2.add("mahesh");
		set2.add("Waran");
		set2.add("venu");
		set2.add("thanu");
		set2.add("mahesh");
		
		System.out.println("The Set2 is " + set2);
		
		//convet Set to list
		
		ArrayList<String> list1 = new ArrayList<String>(set1);
		
		System.out.println(list1);

	}

}
