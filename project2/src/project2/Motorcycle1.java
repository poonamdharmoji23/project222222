package project2;

class Motorcycle1 extends Vehicle {
	
	String enginesize;
	String topspeed;
	
	Motorcycle1(){
		
	}
	Motorcycle1(String enginesize,String topspeed){
		this.enginesize=enginesize;
		this.topspeed=topspeed;
		details("Kawasaki Ninja",2000);
	}

}
