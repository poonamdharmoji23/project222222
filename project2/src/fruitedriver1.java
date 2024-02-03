class fruitedriver1 {
	
	public static void main(String[] args) {
		
		fruite f1=new fruite("mango");
		System.out.println(f1.name);
		System.out.println(f1);
		fruite f2 =f1;
		System.out.println(f2);
		System.out.println(f2.name);
		System.out.println(f1==f2);
		fruite f3=f2;
		fruite f4=f3;
		System.out.println(f3);
		System.out.println(f4);
	}

}
