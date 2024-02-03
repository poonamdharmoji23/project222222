class empdriver1 {

	public static void main(String[] args) {
		
		employee e1=new employee();
		System.out.println(e1);
		employee e2=e1;
		employee e3=e2;
		employee e4=e3;
		employee e5=e4;
		e1.name="vijay";
		e1.id=9;
		e1.phone="9740462944";
		System.out.println(e3.name+"  "+e3.id+"  "+e3.phone);
		e4.name="lisa";
		e4.id=5;
		e4.phone="9776543454";
		System.out.println(e5.name+"  "+e5.id+"  "+e5.phone);
	}
}
