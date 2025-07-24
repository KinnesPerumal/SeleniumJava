package learnJavaListSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Fruits {

	public static void main(String[] args) {
		
//		List<Integer> myList = new ArrayList<Integer>();
//		myList.add(100);
//		System.out.println(myList.get(0));
//		
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("apple");
		list.add("pine");
		list.add("grape");
		Collections.sort(list);
		for (String d : list) {
			System.out.println(d);
			
		}
//		
//		boolean empty = list.isEmpty();
//		System.out.println("is list empty: "+empty);
////		list.clear();//it clear the list
////		System.out.println("is list empty: "+empty);
//		
//		String lisval = list.get(1);
//		System.out.println("Second Value: "+lisval);
//		
//		boolean contains = list.contains("grape");
//		System.out.println("Has Fruit: "+contains);
//		//before remove
//		System.out.println("-----------------------");
//		for(String l:list) {
//			System.out.println(l);
//		}
//		//after remove
//		System.out.println("-----------------------");
//		boolean remove = list.remove("apple");
//		System.out.println("is Removed: "+remove);
//		for(String l:list) {
//			System.out.println(l);
//		}
//		 
//		int size = list.size();
//		System.out.println("Size : "+size);
		
//		System.out.println("----Hasset----");
//		Set<String> set = new HashSet<String>();
//		set.add("apple");
//		set.add("mango");
//		set.add("apple");
//		set.add("pine");
//		set.add("grape");
//		for(String s:set) {
//			System.out.println(s);
//		}
//		System.out.println("----TreeSet----");
//		Set<String> Treeset = new TreeSet<String>();
//		Treeset.add("apple");
//		Treeset.add("mango");
//		Treeset.add("apple");
//		Treeset.add("pine");
//		Treeset.add("grape");
//		for(String t:Treeset) {
//			System.out.println(t);
//		}
//		System.out.println("----LinkedHasSet----");
//		Set<String> LinHS = new LinkedHashSet<String>();
//		LinHS.add("apple");
//		LinHS.add("mango");
//		LinHS.add("apple");
//		LinHS.add("pine");
//		LinHS.add("grape");
//		//create list
//		List<String> myList = new ArrayList<String>(LinHS);
//		for(String ml:myList) {
//			System.out.println(ml);
//		}
//		System.out.println("First value : "+myList.get(0));
		
		
		
//		LinHS.clear();
		//No Get 
//		System.out.println(LinHS.contains("pine"));
//		System.out.println(LinHS.isEmpty());
//		System.out.println(LinHS.size());
//		for(String lHS:LinHS) {
//			System.out.println(lHS);
//		}

	}
	

}
