package project2;

public class car {
	
	double numseat;
	String fueltype;
	
	car(){
		
	}
	car(double numseat,String fueltype){
		this.numseat=numseat;
		this.fueltype=fueltype;
	}
	
	public static car createcar(double numseat, String fueltype) {
		car c=new car(numseat,fueltype);
		return c;
	}
	
	public car displayproperties() {
		System.out.println("numseat:" +" "+ numseat);
		System.out.println("fueltype:" +" "+ fueltype);
		return this;
	}

}
