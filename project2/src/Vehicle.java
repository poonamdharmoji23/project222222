class Vehicle {

	String model;
	double year;
	public Vehicle(String model,double year){
		this.model=model;
		this.year=year;
	}
	public void displayvehicle() {
		System.out.println("Model:"+model);
		System.out.println("Year:"+year);
	}
}
