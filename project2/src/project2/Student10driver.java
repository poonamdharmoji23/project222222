package project2;

import java.util.Arrays;

import java.util.Comparator;

class studentnamecomparator implements Comparator{
	
	public int compare(Object o1,Object o2) {
		
		Student10 s1=(Student10)o1;
		Student10 s2=(Student10)o2;
		
		return s1.getname().compareTo(s2.getname());
	}
}

class Student10driver {
	
	public static void main(String[] args) {
		
		Student10[] students=new Student10[5];
		students[0]=new Student10(1,"rita");
		students[1]=new Student10(2,"lisa");
		students[2]=new Student10(3,"nisha");
		students[3]=new Student10(4,"aisu");
		students[4]=new Student10(5,"sony");
		
		Arrays.sort(students , new studentnamecomparator());
		
		//display state of all the students
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
	}

}
