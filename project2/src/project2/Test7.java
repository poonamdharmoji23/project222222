package project2;

public class Test7 {
	
	public static void main(String[] args) {
		
		A3 a1=new B2();
		
		//B2 b1= a1;//CTE
		
		B2 b1=(B2)a1;
		
		System.out.println(b1 instanceof A3);
		
	}

}
