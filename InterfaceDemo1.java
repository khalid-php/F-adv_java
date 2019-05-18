/* A class can implement any number of interface. if a class is implemeting
multiple interface  then the class must override all the abstract method of all
the interface.
*/
interface MyInterface1 {
	void md();
}
interface MyInterface2 {
	void md1();
} 
interface MyInterface3 {
	void md2();
}
class MyImpl implements MyInterface1,MyInterface2,MyInterface3 {
	public void md() {
		System.out.println("myimple class m1 ");
	}
	public void md1() {
		System.out.println("myimple class m2 ");
	}
	public void md2() {
		System.out.println(" myimple class m3 ");
	}
}
//case 1:
class Myapp8 {
	public static void main(String args[]) {
		MyImpl ml=new MyImpl();
		ml.md();
		ml.md1();
		ml.md2();	
	}
}