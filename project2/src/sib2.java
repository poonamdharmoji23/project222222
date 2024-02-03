class sib2 {
	
		static {
			System.out.println("from SIB1");
		}// end of static block
		public static void main(String[] args) {
			System.out.println("from main");
		}
		static {
			System.out.println("from SIB2");
		}
}
