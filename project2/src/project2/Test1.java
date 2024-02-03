package project2;

public class Test1 {
	
	public static void main(String[] args) {
		
		Cab c1=new Mini();
		System.out.println(c1);
		
		Cab c2=new Sedan();//upcasted
		System.out.println(c2);
		
		Cab c3=new Lux();//upcasted
		System.out.println(c3);
	}

}
