/* Interface can extends any number of interfacaces. if a class is implementing thechild interface,
then we must ovrride all the abstract methods of parents intrerface and all the abstract method 
of parents interface  in child als0.

*/
import java.util.*;
interface Myinterface1{
 	void m1();
 }
interface Myinterface2 {
 	void m2();
}
interface Myinterface3 extends Myinterface1,Myinterface2 {
	void m3();
}
class Imple4 implements  Myinterface3 {
	public void m1() {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter first no ");
		int p=sc2.nextInt();
		System.out.println("Enter second no ");
		int q=sc2.nextInt();
		double mul= p*q;
		System.out.println(mul);

	}
	public void m3() {
		System.out.println("Enter any two no-");
		Scanner sc1=new Scanner(System.in);
		int m=sc1.nextInt();
		System.out.println("Enter second no--");
		int n=sc1.nextInt();
		int res1=n-m;
		System.out.println("substraction "+ res1);
	}
	public void m2() {
		System.out.println("Enter any no: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter second no ");
		int b=sc.nextInt();
		int res=a+b;
		System.out.println(res);
	}
	 
}
class Myapp10{
	public static void main(String arg[]) {
		Imple4 ip4 =new Imple4();
		ip4.m1();
		ip4.m2();
		ip4.m3();
	}
}

