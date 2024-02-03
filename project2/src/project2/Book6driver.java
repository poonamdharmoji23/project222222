package project2;
import java.util.Arrays;
class Book6driver {
	
	public static void main(String[] args) {
		
		Book6[] books=new Book6[5];
		books[0]=new Book6(500,"you are forever");
		books[1]=new Book6(300,"Hitler");
		books[2]=new Book6(250,"the faith");
		books[3]=new Book6(100,"trust in the well");
		books[4]=new Book6(50,"spirit");
		
		Arrays.sort(books);
	
	for(int i=books.length-1;i>=0;i--) {
		
		System.out.println("title:"+books[i].title+" "+"price:"+books[i].price);
		System.out.println("-------------------------------------");
		
	}

	}
}
