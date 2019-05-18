abstract class Cone5 {
	void m1() {
		System.out.println("Cone5 class m1 method is the use...");
	}
	abstract void m2();
}
class Ctwo5 extends Cone5 {
	void m2() {
		System.out.println("Ctwo5 class m2 method is use....");
	}
	void m3() {
		System.out.println("Ctwo5 class m3 method is use .....");
	}
}
class Myapp5 {
	public static void main(String arg[]) {
		Ctwo5 c5=new Ctwo5();
		c5.m1();
		c5.m2();
		c5.m3();
	}
}