public class NewInstance1 {
	public static void main(String arg[]) {

		NewInstance ni = new NewInstance();

		try{
			Class c=Class.forName(arg[0]);
			Object obj=c.newInstance();
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(InstantiationException ie) {
			ie.printStackTrace();
		}
		catch(IllegalAccessException iae) {
			iae.printStackTrace();
		}
	}
}