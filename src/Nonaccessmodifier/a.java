package Nonaccessmodifier;

public class a {
	int a=20;
	static int b=40;
	public void abc () {
		System.out.println("this is abc method");
		System.out.println(a);
		System.out.println(b);
	}
	public static void pqr () {
	
		System.out.println(b);
	}

	public static void main(String[] args) {
		a b=new a();
		b.abc();
		
		// TODO Auto-generated method stub

	}

}
