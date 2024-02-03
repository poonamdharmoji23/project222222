package project2;

class car6 {
	
	private tyre[] tyres=new tyre[4];
	
	// variable act as index
	
	int i=0;
	
	// helper method to instantiate Tyre object
	void addtyre(tyre Tyre) {
		tyres[i++]=Tyre;
	}
	//getter for tyres
	tyre[] gettyres() {
		return tyres;
	}
}
