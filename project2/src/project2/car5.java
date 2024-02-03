package project2;

class car5 {
	
	//achieve Has-a with tyre
	//using early instantiation technique
	
	private tyre[] tyres= {new tyre("apollo"),new tyre("bridgestone"),new tyre("MRF"),new tyre("machellian")};
	
	//getter method
	
	tyre[] gettyres() {
		
		return tyres;
	}

}
