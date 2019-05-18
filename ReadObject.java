import java.io.*;

public class ReadObject {
	public static void main(String arg[])throws IOException,
	ClassNotFoundException {
		FileInputStream fis = new FileInputStream("mydata.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		DescDemo d=(DescDemo)obj;
		ois.close();

	}
}