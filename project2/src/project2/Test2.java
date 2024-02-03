package project2;

import java.util.Scanner;
public class Test2 {
	
	public static void main(String[] args) {
		
		System.out.println("******Select a Cab******");
		System.out.println("Press 1 for Mini");
		System.out.println("Press 2 for Sedan");
		System.out.println("Press 3 for Lux");
		System.out.println("Enter the choice");
		Scanner s= new Scanner(System.in);// to get input from user
		int choice=s.nextInt();
		Cab c=null;
		switch(choice) {
		case 1:{
			c=new Mini();
		}
		break;
		case 2:{
			c=new Sedan();
		}
		break;
		case 3:{
			c=new Lux();
		}
		break;
		default:System.out.println("inavlid input");
		}//end of switch
	System.out.println(c);	
	}

}
