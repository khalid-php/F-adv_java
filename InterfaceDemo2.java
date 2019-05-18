/* case to Implementation class 
*/
//case 2

interface Sample {
	abstract void m1();
}
interface Test {
	abstract void m2();
}
interface Example {
	abstract void m3();
}
class Impled implements Sample,Test,Example {
	public void m1() {
		System.out.println("the Sample class is the m1 ..");
	}
	public void m2() {
		System.out.println(" the Test class is the m2---");
	}
	public void m3() {
		System.out.println(" the Example class the m3====");
	}	
}
class Myapp9 {
	public static void main(String args[]) {
		Sample s=new Impled();
		s.m1();
		Impled i=(Impled)s; //the process of dowcasting 
		i.m2();
		i.m3();
	}
}