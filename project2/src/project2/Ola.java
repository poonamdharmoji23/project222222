package project2;

class Ola {
	
	// achieve has-a with cab
	
	private Cab1 c1;
	
	//getter method
	
	Cab1 getcab() {
		return c1;
	}
	//helper for instantiation
	void bookcab(Cab1 c1) {
		// convert local to Ola object//
		this.c1=c1;
		//thanks message//
		c1.printthanks();
	}

}
