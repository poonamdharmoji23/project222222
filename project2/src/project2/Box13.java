package project2;

public class Box13 {
	
	public static void main(String[] args) {
		
		Box12 b1=new Box12(10);
		Box12 b2=new Box12(10);
		
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}

}
