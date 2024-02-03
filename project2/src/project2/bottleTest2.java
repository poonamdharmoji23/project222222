package project2;

public class bottleTest2 {
	
	public static void main(String[] args) {
		
		String color=new bottle().displayproperties().setcapacity(500)
					.displayproperties().setcolor("gray")
					.displayproperties().getcolor().toUpperCase();
		
		System.out.println("=============================");
		System.out.println(color);
	}

}
