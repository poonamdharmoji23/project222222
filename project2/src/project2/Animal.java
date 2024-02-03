package project2;

class Animal {
	
	double height;
	static {
		System.out.println("class animal is loaded");
	}
	Animal(){
		
	}
	Animal(double height){
		this.height=height;
		System.out.println(height);
	}
	public void eat() {
		System.out.println("eats non-veg");
	}

}
