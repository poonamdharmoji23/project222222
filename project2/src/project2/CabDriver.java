package project2;

import java.util.Scanner;
class CabDriver {
	
	public static void main(String[] args) {
		
		//instantiate ola
		Ola O1=new Ola();
		System.out.println("**** Welcome to Ola ****");
		System.out.println("press 1 for Mini");
		System.out.println("press 2 for Sedan");
		System.out.println("press 3 for Luxury");
		System.out.println(" Enter your choice");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		switch(choice) {
		case 1:{
			O1.bookcab(new Mini1());
		}
		break;
		case 2:{
			O1.bookcab(new Sedan1());
		}
		break;
		case 3:{
			O1.bookcab(new lux1());
		}
		break;
		default: System.out.println("Invalid Selection");
		}
		
	} // end of switch

}
