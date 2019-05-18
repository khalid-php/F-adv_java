/* the program is the use of the example of the inheritance :
 The process of acuiring the member from one class to another class is called 
 as inheritance using inheritance we can achive reusability and there 
 by reduce the code size and reduce the developmet time of the application.
 */
 class Cone {
 	void methodOne() {
 		System.out.println("Cone class methodOne ");
 	}
}
class Ctwo extends Cone {
	void methodTwo() {
		System.out.println("ctwo class method ");
	}
}
class Myapp {
	public static void main(String args[]) {
		Ctwo ct=new Ctwo();
		ct.methodOne();
		ct.methodTwo();
	}
}