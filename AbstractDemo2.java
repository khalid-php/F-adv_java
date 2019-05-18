abstract class Cone6 {
	void m1() {
		System.out.println("Cone6 class m1 methos is exceuted....");
	}
	abstract void m2();
	abstract void m3();
}
class Ctwo6 extends Cone6  {
	void m2() {
		System.out.println(" Ctwo6 class m2 method is the use ......");
	}
	void m3() {
		System.out.println(" Ctwo6 class m3 method is the use----");
	}
	void m4() {
		System.out.println("Ctwo6 class m4 method is the use ===");
	}
}
class Myapp6 {
	public static void main(String args[]) {
	Cone6 c6=new Ctwo6();
	c6.m1();
	c6.m2();
	c6.m3();
	Ctwo6 d=(Ctwo6)c6; //downcadtiong the object is 
	d.m4();	
	}
}
