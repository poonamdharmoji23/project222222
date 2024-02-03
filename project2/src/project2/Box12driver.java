package project2;

class Box12driver {
	
	public static void main(String[] args) {
		
		Box12 b1=new Box12(10);
		Box12 b2=b1;
		
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
	}

}
