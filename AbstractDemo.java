/* Concrete method : if a method contain both declarartion and difination 
then the method is called as concreate method.
Concreate class :- if all the method of a class are concreate then the class will be 
called as concreate method.
a concreate class can be instantiated i.e we can create an object of concreate 
class using that object we can acess the memeber of that class .
Absract method : if a method contain only declaretion without any definition 
then it is said to be abstract method.
abstract method must end with semi colon(;) and they must be declereds as
with abstract keyword.
Abstract class : if a class contains some abstract methods then, the class
should be callled abstract class .
An abstract class can be combination of abstract methods and non-abstract 
methods An abstract class can contain zero or more abstract method. if a class 
does not contain any abstract method then declering the class as abstract 
is optional if a class contains at least one abstract method then declering 
the class as abstract is mandatory.
An abstract class cannot be instantiated i.e. we cannot create an object 
of the abstract class and therefore we cannot access the member ofthat class.
In order to access the members of the abstract class, we need to inherit the 
class into another class and override all the abstract methods available in the abstract
class . if the subclass does not override atleast one abstract method then
*/
abstract class Cone4 {
	void m1() {
		System.out.println("Cone4 class m1 method ");
	}
	abstract void m2();
}
class Ctwo4 extends Cone4 {
	void m2() {
		System.out.println("ctwo4 class m2 method ");
	}
}
class Myapp4 {
	public static void main(String args[]) {
		Ctwo4 c4=new Ctwo4();
		c4.m1();
		c4.m2();
	}
}