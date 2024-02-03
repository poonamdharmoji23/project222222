package project2;

public class carDriver1 {
	
	public static void main(String[] args) {
		
		
		//create car instance
		Car1 c1=new Car1("HondaCity");
		//fetch and print car model name & Cc
		System.out.println(c1.getModelName());
		System.out.println(c1.getEngine().gethp());
	}

}
