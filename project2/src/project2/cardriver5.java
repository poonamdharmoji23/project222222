package project2;

class cardriver5 {
	
	public static void main(String[] args) {
		
		car5 c=new car5();
		//to print total tyres
		System.out.println(c.gettyres().length);
		
		// to print brand of all tyres
		
		for(int i=0;i<c.gettyres().length;i++) {
			
			System.out.println(c.gettyres()[i].getbrand());
		}
	}

}
