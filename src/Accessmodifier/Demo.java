package Accessmodifier;

public class Demo {
	 protected  int a=10;
	protected void abc() {
		System.out.println("this is abc method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.abc();
		System.out.println(d.a);
	}
	

}
