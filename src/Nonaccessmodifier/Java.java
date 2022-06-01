package Nonaccessmodifier;

public class Java {
	 int a=20;
	static int b=40;
	
	
	public void abc () {
		int a=30;
		System.out.println("this is abc method");
		System.out.println(a);
		System.out.println(b);
	}
	public static void pqr() {
		System.out.println("this is static pqr method");
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java j=new Java();
		j.abc();
		Java.pqr();
		

	}

}
