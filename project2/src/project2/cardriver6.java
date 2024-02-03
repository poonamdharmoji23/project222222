package project2;

class cardriver6 {
	
	public static void main(String[] args) {
		
		car6 c=new car6();
		System.out.println(c.gettyres());
		
		//add tyre object
		
		c.addtyre(new tyre("apollo"));
		c.addtyre(new tyre("MRF"));
		c.addtyre(new tyre("CEAT"));
		c.addtyre(new tyre("JK"));
		
		for(int i=0;i<c.gettyres().length;i++) {
			System.out.println(c.gettyres()[i].getbrand());
		}
	}
}
