/* Method Overriding : it is a process of the specifing two methods that  have same siganture and same 
returntype in  two type different classes that have IS-A relationship
method ovrriding can be impleemeted only for instance method.
Method overriding can be implemented only in two different class that have IS-A 
relationship.
In method overriding the execution of a method will be the object that 
is created..
*/
class Cone1 {
	void ma1(int x) {
		System.out.println("clone class m1 with int");
	}
}
class Ctwo1 extends Cone1 {
	void ma1(int y) {
		System.out.println(1234+89090);
	}
}
class Myapp1 {
	public static void main(String arg[]) {
		Cone1 a=new Cone1();
		a.ma1(12);
		//Ctwo1 b=new Ctwo1();
		//b.ma1(120);

		Cone1 c=new Ctwo1();
		c.ma1(9);
	}
}