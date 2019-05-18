/* new operator  is used for creating an object of a class.In the application
developments,most of the time, the object creation will be done by 
using new operator 
the new operator has to be used,when we know the name of 
in advanced whose  object has be created.
when we creating an object of a class by using new operator 
we can specify either a */
public class NewOpera {
	static {
		System.out.println("newOpera class static block ");
	}
	{
		System.out.println("sample class Instance block ");
	}
	NewOpera() {
		System.out.println("newOpera class zero constractor ");
	}
	NewOpera(int x) {
		System.out.println("newOpera class parameterized ");
	}
}