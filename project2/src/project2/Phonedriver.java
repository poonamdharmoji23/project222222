package project2;

class Phonedriver {
	
	public static void main(String[] args) {
		
		Phone[] phones=new Phone[4];
		phones[0]=new Phone(8,64);
		phones [1]=new Phone(7,148);
		phones [2]=new Phone(2,16);
		phones [3]=new Phone(4,128);
		
		for(int i=0;i<phones.length;i++) {
			System.out.println(phones[i]);
		}
	}

}
