package project2;

public class motorcycle {
	
	String enginesize;
	double topspeed;
	
	motorcycle(){
		
	}
	motorcycle(String enginesize,double topspeed){
		this.enginesize=enginesize;
		this.topspeed=topspeed;
	}
	public static motorcycle createmotorcycle(String enginesize,double topspeed) {
		motorcycle m = new motorcycle(enginesize,topspeed);
		return m;
	}
	public motorcycle displayproperties() {
		System.out.println("enginesize:"+" "+ enginesize);
		System.out.println("topspeed:"+" "+ topspeed);
		return this;
	}

}
