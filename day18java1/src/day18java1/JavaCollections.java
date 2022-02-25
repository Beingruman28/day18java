package day18java1;

import java.util.*;

public class JavaCollections {
        void display(List<String> list) {
        	Iterator<String> obj = list.iterator();
        	while(obj.hasNext()) {
        		System.out.println("Element is :"+ obj.next());
        	}
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> oj = new LinkedList<>();
		oj.add("rohit");
		oj.add("virat");
		oj.add("rahul");
		oj.add("rishab");
		oj.add("shami");
		oj.add("bhumrah");
		System.out.println("Element is :"+ oj);

		JavaCollections jc = new JavaCollections();
		jc.display(oj);
	}

}
