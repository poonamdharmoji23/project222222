package project2;

class CalciVer11 extends BasicCalci1 implements AbstractCalciVer11 {
	
	public double power(double s,double t) {
		
		return s/2*t/2;
		
	}
	public static void main(String[] args) {
		
		CalciVer11 c1=new CalciVer11();
		System.out.println("power of 2 numbers"+" "+c1.power(6, 8));
		System.out.println("addition of 2 numbers"+" "+c1.add(4, 4));
		System.out.println("addition of 3 numbers"+" "+c1.add(2, 2, 2));
		System.out.println("substarction of 2 numbers"+" "+c1.sub(20, 5));
		
	}
	

}

