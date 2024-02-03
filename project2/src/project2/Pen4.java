package project2;

class Pen4 {

	double price;
	
	Pen4(double price){
		this.price=price;
	}
	
	//overriding
	
	public boolean equals(Object O) {
		
		Pen4 t=(Pen4)O;
		return this.price==t.price;
		
	}
}
