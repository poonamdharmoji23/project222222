class StudentDriverTest {

		public static void main(String[] args) {
			
			Student1 s1=new Student1("sheela","12th");
			System.out.println(s1.getname());
			s1.displaymarks();
			double avg=Studentutility.averagemarks(s1);
			double max=Studentutility.maxmarks(s1);
			double min=Studentutility.minmarks(s1);
			double total=Studentutility.totalmarks(s1);
			System.out.println("=============");
			System.out.println(avg);
			System.out.println(max);
			System.out.println(min);
			System.out.println(total);
			
			
			
		
		}
}
