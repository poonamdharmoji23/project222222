package project2;

class Baseclass{
	
	int x=10;
}

class Derivedclass extends Baseclass{
	
	int y=20;
}

class Example4 {
	public static void main(String[] args) {
		
		Baseclass obj1=new Baseclass();
		System.out.println(obj1.x);
		//System.out.println(obj1.y);//compile time error
		
		Derivedclass obj2=new Derivedclass();
		System.out.println(obj2.x);
		System.out.println(obj2.y);
	}

}
