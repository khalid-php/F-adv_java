/* An Interface is a collection of only abstract methods. the variable of an interface
are declered as public,static and find whether we specify or not the method
of interface are declared as public and abstract whether we specify or not 
An interface can be considerced as 100% abstract and there fore interface cannot 
be instantiated .In order to acess the members of an interface,we need to inherit
the interface into another class by using implements keywords and override all the
all the abstract method of the interface
if the class is implements an implementing an interface then,that class must
provide implemenation to all the abstract methods available in that interface.
if the subclass does not provided implementation to atleast one abstract methods
then declered the subclass as abstract if the subclass is providing implementation
to all the absrtract methods then the subclass should be called as implementation class 
.An interface can have any number of implementation class 
*/
interface MyInterface {
	void m1();
	void m2(); 	
}
class MyImpl implements MyInterface {
	public void m1() {
		System.out.println("MyImpl class m1 ....");
	}
	public void m2() {
		System.out.println("MyImpl class m2 ----");
	}
}
class Myapp7 {
	public static void main(String arg[]) {
		MyImpl mi=new MyImpl();
		mi.m1();
		mi.m2();

	MyInterface mf=new MyImpl();
	mf.m1();
	mf.m2();
	}
} 