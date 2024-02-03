package project2;

class triangle extends shape {
	
	double base;
	double height;
	triangle(double base,double height){
		this.base=base;
		this.height=height;
	}
	//To display properties of triangle
	void display() {
		System.out.println("base :"+this.base);
		System.out.println("height :"+this.height);
	}

}
