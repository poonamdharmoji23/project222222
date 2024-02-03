package project2;

abstract class Demo1 {
	
	abstract void test();

	}
/*class example1 inherits abstract method test()
 * therefore
 * case1:make class example1 abstarct
 * case2:override inherited abstarct method
 */
class example1 extends Demo1{
	void test() {
		System.out.println("good morning");
	}
	
}
