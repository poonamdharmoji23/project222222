package project2;

class CalciVer12 extends BasicCalci1 implements AbstractCalciver12 {
	
	public double square(double p) {
		return p*p;
	}
	public double cube(double c) {
		return c*c*c;
	}
	public static void main(String[] args) {
		
		CalciVer12 c2=new CalciVer12();
		System.out.println("squar of the number"+" "+c2.square(5));
		System.out.println("cube of the number"+" "+c2.cube(4));
		System.out.println("addition of 2 numbers"+" "+c2.add(4, 4));
		System.out.println("addition of 3 numbers"+" "+c2.add(2, 2, 2));
		System.out.println("substarction of 2 numbers"+" "+c2.sub(20, 5));
	}

}
