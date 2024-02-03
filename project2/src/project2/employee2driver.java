package project2;

class employee2driver {
	
	public static void main(String[] args) {
		
		Manager2 m1=new Manager2(10);
		m1.employeedetails("Raj", 50000);
		System.out.println(m1.numberofsubordinates);
		System.out.println("-----------------------");
		clerk c1=new clerk("5 page/hr");
		c1.employeedetails("Rossi", 100000);
		System.out.println(c1.typingspeed);
		System.out.println("-----------------------");
		salesperson s1=new salesperson(7.5);
		s1.employeedetails("Rambo", 200000);
		System.out.println(s1.commisionrate);
		
	}

}
