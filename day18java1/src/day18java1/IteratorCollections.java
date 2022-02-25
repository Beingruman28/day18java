package day18java1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class IteratorCollections {

        void display(List<String> list) {
        	Iterator<String> obj = list.listIterator();
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

		IteratorCollections ic = new IteratorCollections();
		oj.sort(null);
		ic.display(oj);
		System.out.println("-------------------");
		Collections.reverse(oj);
		ic.display(oj);
		

	}

}
