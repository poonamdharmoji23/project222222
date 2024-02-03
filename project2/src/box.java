class box3 {
	double length;
	box3(){
		
	}
	
	box3(double length){
		this.length=length;
	}
	
	//design a factoryMethod, to create an instance of box and return its reference//
	
	public static box3 createbox() {
		
		return new box3();
		
	}
	public static box3 createbox(double l) {
		
		return new box3(l);
	}
	////
	//
	//
	//
	///////
	
}
