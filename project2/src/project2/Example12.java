package project2;

import java.util.Comparator;
class Example12 {
	
	public static void main(String[] args) {
		
		laptop1 l1=new laptop1(8,500);
		laptop1 l2=new laptop1(16,500);
		
		Comparator c=new Ramcomparator();
		
		if(c.compare(l1, l2)>0) {
			
			System.out.println("l1 is largest ram");
		}
		else
			System.out.println("l2 is largest ram");
		
	}

}
