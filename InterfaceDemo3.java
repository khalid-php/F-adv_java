/* case */
interface Myinterface1 {
	void m1();
}
interface Myinterface2 {
	void m2();
}
class MyImpl implements Myinterface1,Myinterface2 {
	public void m1() {
		System.out.println("the method m1 ++++ ");
	}
	public void m2() {
		System.out.println(" the method m2 ----");
	}
}
class Myapp10 {
	public static void main(String args[]) {
		Myinterface2 m2=new MyImpl();
		MyImpl i= (MyImpl) m2;//upcasting the 
		m2.m2();
		i.m1();	
	}
}