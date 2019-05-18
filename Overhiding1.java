class Cone3 {
	void m1() {
		System.out.println("cone3 is class m1 method ");
		this.m2();
	}
	void m2() {
		System.out.println("cone  class m2 method");
	}
}
class Ctwo3 extends Cone3 {
	void m2() {
		System.out.println("ctwo class m2 method ");
	}
}
class Myapp3 {
	public static void main(String arg[]) {
		Cone3 c=new Ctwo3();
		c.m1();
		c.m2();
	}
}

