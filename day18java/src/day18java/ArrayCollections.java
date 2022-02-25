package day18java;

import java.util.*;

public class ArrayCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arraysize = new int[5];
		    Scanner in = new Scanner(System.in);
		    for(int i=0;i<arraysize.length;i++)
		    	arraysize[i]=in.nextInt();

		    for(int i=0;i<arraysize.length;i++)
			    System.out.print(arraysize[i]+" ");
		   
		in.close();
	}
}