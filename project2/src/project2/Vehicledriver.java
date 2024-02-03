package project2;

class Vehicledriver {
	
	public static void main(String[] args) {
		
		Car2 c1=new Car2(50,"Petrol");
		System.out.println(c1.fueltype);
		System.out.println("seats:"+c1.numseats);
		System.out.println("--------------");
		Truck t1=new Truck(500,7.9);
		System.out.println("cargocapacity:"+t1.cargocapacity);
		System.out.println("bealenght:"+t1.bealenght);
		System.out.println("----------------");
		Motorcycle1 m1=new Motorcycle1("400cc","150km/hr");
		System.out.println("enginesize:"+m1.enginesize);
		System.out.println("topspeed:"+m1.topspeed);
	}

}
