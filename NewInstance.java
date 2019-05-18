/* the newinstance() is used  for creating an object of a class
newInstance() has to be used,when we do not know the name of the class
during the developments time if we know the name of the class at runtime.
when we are creating an object of a class by using newInstance() then
the programmer will be responsible for loading the class explicity 
by using class.Forname();
when we are creating an object of a class by using newInstance
() then the class must contain a zero parameterized contructor.
*/
public class NewInstance {
	static {
		System.out.println("newinstance class static block ");
	}
	{
		System.out.println("newInstance class instance block ");
	}
	NewInstance() {
		System.out.println("newinstance class zero constructor ");
	}
	NewInstance(int x) {
		System.out.println("newInstance class para constructor ");
	}
}
