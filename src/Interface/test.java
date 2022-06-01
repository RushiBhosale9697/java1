package Interface;

public class test implements I1, I2{

		// TODO Auto-generated method stub

	@Override
	public void display() {
		System.out.println("this is show Method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("this is display method");
		// TODO Auto-generated method stub
		
	}


     public static void main(String[] args) {
    	 test t11=new test();
    	 t11.display();
    	 t11.show();
     }
}  


