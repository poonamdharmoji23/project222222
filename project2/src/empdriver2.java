class empdriver2 {
	
	public static void main(String[] args) {
		
		emp1 l1=new emp1();
		System.out.println(l1);
		emp1 l2=l1;
		emp1 l3=l2;
		emp1 l4=l3;
		emp1 l5=l4;
		l1.color="green";
		l1.lifespan=100;
		System.out.println(l3.color+"  "+l3.lifespan);
		l4.color="red";
		l4.lifespan=50;
		l5.eat();
		
		
		
			}
}
