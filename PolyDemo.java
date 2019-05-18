/* if a single entity show multiple behaviour or multiple forms then it is called as 
polymorphism .
method overloading + method overriding + method hiding  overhiding= poly 
morphism

*/
class Cone {
	void m1(int x) {
		System.out.println("Cone class m1 with int");
	}
	void m1(double y) {
		System.out.println("cone class m1 with doubly ");
	}
}
class Myapp {
	public static void main(String[] ar) {
		Cone c=new Cone();
		c.m1(6);
		c.m1(90.90);
	}
}
