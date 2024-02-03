package project2;

class Vehicle {
	
	String model;
	double year;
	
	Vehicle(){
		
	}
	Vehicle(String model,double year){
		this.model=model;
		this.year=year;
	}
	public void details(String model,double year) {
		System.out.println("Vehicle model:"+model);
		System.out.println("Vehicle year:"+year);
	}

}
