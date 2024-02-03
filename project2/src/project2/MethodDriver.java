package project2;

public class MethodDriver {
	
	public static void main(String[] args) {
		
		SimplyMethods sm1 = SimplyMethods.create("vijay", 90, 'P').display().noln();
		System.out.println();
		Own o1 = Own.create("BCA", 650).displayOwn();
		System.out.println("*************");
		nonveg nv1 = nonveg.details("Chicken", 300, "Desi").display();
		
	}

}
