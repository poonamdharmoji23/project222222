package project2;

class BasicCalci1 implements AbstractBasicCalci {
	
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int p,int q,int r) {
		return p+q+r;
		}
	public int sub(int i,int j) {
		return i-j;
	}
	public static void main(String[] args) {
		
		BasicCalci1 b1=new BasicCalci1();
		System.out.println("addition of 2 numbers"+" "+b1.add(4, 4));
		System.out.println("addition of 3 numbers"+" "+b1.add(2, 2, 2));
		System.out.println("substarction of 2 numbers"+" "+b1.sub(20, 5));
	}

}
