import java.io.*;
public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("abc.txt");
		System.out.println(f.exists());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
	}

}
