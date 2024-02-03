package project2;

class DriverTest1 {
	
	public static void main(String[] args) {
		
		BasicCalci b1=new BasicCalci();
		System.out.println("addition of two numbers"+" "+b1.add(5, 5));
		System.out.println("addition of three numbers"+" "+b1.add(5, 5, 5));
		System.out.println("Substraction of two numbers"+" "+b1.sub(30, 10));
		
		CalciVer1 c1=new CalciVer1();
		System.out.println(c1.power(2, 3));
		
		CalciVer2 c2=new CalciVer2();
		System.out.println(c2.square(5));
		System.out.println(c2.cube(3));
		
	}

}
