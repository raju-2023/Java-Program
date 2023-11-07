package IO_opertion;
import java.io.*;

public class LaunchFile1 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
//		File file1=new File("pw.txt");
//		System.out.println(file1.exists());//false
//		
//		file1.createNewFile();
//		c//true
		
		File dir=new File("PW");
		System.out.println(dir.exists());//false
		dir.mkdir();
		System.out.println(dir.exists());//true
	}

}
