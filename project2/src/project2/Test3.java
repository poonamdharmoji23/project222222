package project2;

import java.util.Scanner;

class Box{
	
	double price=50;
	
}
public class Test3 {
	
public static void displayreference(Object o) {
	
	System.out.println(o);
	
	/* o is java.lang.object type
	 * with the help of o, we can access only members of object
	 */
	
	}

public static void main(String[] args) {
	
	displayreference(new Mini());
	displayreference(new Sedan());
	displayreference(new Lux());
	displayreference(new Box());
	displayreference(new Scanner(System.in));
	
}
}


