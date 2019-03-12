package oopConcepts;

public class Car {
	
	int mod;
	int wheels;

	public static void main(String[] args) {
    // new Car()--is the object of the class
	//new keyword is used to create the object for a class.
	//a,b and c----object reference variables
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		a.mod=2015;
		a.wheels=4;
		b.mod=2016;
		b.wheels=4;
		c.mod=2017;
		c.wheels=4;
		System.out.println(a.mod);
		System.out.println(a.wheels);
		System.out.println(b.mod);
		System.out.println(b.wheels);
		System.out.println(c.mod);
		System.out.println(c.wheels);
		a=b;
		b=c;
		c=a;
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		b.mod=30;
		System.out.println(b.mod);
		
		
	}

}
