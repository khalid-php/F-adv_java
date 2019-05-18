/* Clone() this method can be used for taking the backup of an object.
Using the clone() we can create a duplicate copy of the existing object
An object of any class will be created by the jvm by default the 
create an object of a class in a regular style. if the jvm create 
be duplicated to create an object in a special way the class must 
must implement cloneable.
Cloneable is a marked Interface or tagged interface which provide 
some instruction to the jvm create the object in a special way so 
so that we can create a duplicate copy of an object.
*/
class CloneDemo implements Cloneable {
	int marks =89;
	public static void main(String arg[]) {
		CloneDemo cd=new CloneDemo();
		System.out.println(cd.marks);

		Object obj=cd.clone();
		CloneDemo cd1=(CloneDemo)obj;

		cd1.marks=190;
		System.out.println(cd.marks);
		System.out.println(cd1.marks);
		System.out.println("difference between " +(cd.marks - cd1.marks));
	}
}