import java.io.*;
public class StoreObject {
	public static void main(String arg[]) throws Exception{
		FileOutputStream fos=new FileOutputStream("mydata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		DescDemo dd=new DescDemo();
		oos.writeObject(dd);
		oos.close();
	}
}