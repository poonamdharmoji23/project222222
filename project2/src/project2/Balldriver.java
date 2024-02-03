package project2;

class Balldriver {
	
	public static void main(String[] args) {
		
		Ball b1=new Ball();
		Basketball b2=new Basketball("Team game");
		System.out.println("radius of basketball:"+b2.Ballradius(4.7));
		System.out.println(b2.game);
		System.out.println("***********************");
		Football f1=new Football("Outdoorgame");
		System.out.println("radius of football:"+f1.Ballradius(8.66));
		System.out.println(f1.game);
		System.out.println("***********************");
		Tennisball t1=new Tennisball("Single Player Game");
		System.out.println("radius of tennisball:"+t1.Ballradius(3.35));
		System.out.println(t1.game);
		
	}

}
