package ArrayList;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		ArrayList <Integer> a=new ArrayList <>();
		a.add(100);
		a.add(200);
		a.add(300);
		System.out.println(a);
	     System.out.println(a.contains(100));	 // shows true or false
	     System.out.println(a.get(0));           //get method
	     System.out.println(a.get(1));
	     a.remove(0);                           //next output yet
	     System.out.println(a.get(0));
	     System.out.println(a.size());         //index kiti ahet te dakhavte
	     a.clear();
	     System.out.println(a.size());
	     


	}

}
