package ArrayList;

import java.util.ArrayList;

public class Just {

	public static void main(String[] args) {
		ArrayList<Character>a=new ArrayList<>();
		a.add('b');
		a.add('c');
		System.out.println(a.contains('b'));
	System.out.println(a.get(0));	
	a.remove(0);
	System.out.println(a.get(0));
	

	

	}

}
