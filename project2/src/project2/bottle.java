package project2;

public class bottle {
	
	private String color;
	double capacity;
	bottle(){
		
	}
	bottle(String color,double capacity){
		this.color=color;
		this.capacity=capacity;
	}
	//getter
	public String getcolor() {
		return color;
	}
	//setter
	public bottle setcolor(String color) {
		this.color=color;
		return this;
	}
	//getter
	public double getcapacity() {
		return capacity;
	}
	//setter
	public bottle setcapacity(double capacity) {
		this.capacity=capacity;
		return this;
	}
	public bottle displayproperties() {
		System.out.println("color:"+ color);
		System.out.println("capacity:"+capacity+"ml");
		return this;
	}
} 
