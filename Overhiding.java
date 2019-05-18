/* it is process of the specify two method that have same signature and same
returntype in two different classes that have IS-A relationship.
Method overhinding can be implemented only for the static method
method  overriding can be implemented only into two different class 
that have IS-A relationship.
In method overriding the excution of a method will be based on the 
reference that is declared.
*/
class Cone1 {
	static void m1() {
		System.out.println("Cone class m1 with int ");
	}
}
class Ctwo2 extends Cone1 {
	static void m1() {
		System.out.println("ctwo class m1 with int ");
	}
}
class Myapp2 {
	public static void main(String arg[]) {
		Cone1 a1=new Cone1();
		a1.m1();
		Ctwo2 b1=new Ctwo2();
		b1.m1();
		Cone1 c1=new Ctwo2();
		c1.m1();
	}
}