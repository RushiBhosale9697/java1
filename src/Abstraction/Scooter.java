package Abstraction;

public class Scooter extends Vehical {

	public static void main(String[] args) {
		Scooter sc=new Scooter();
		sc.start();
		Car c=new Car();
		c.start();
		
		
	}

	@Override
	public void start() {
		System.out.println("start with kick");
		// TODO Auto-generated method stub
		
	}

}
