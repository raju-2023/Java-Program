package IO_opertion;
import java.io.*;
public class LaunchFileWriter {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		File dir=new File("PW");
		File file=new File(dir,"pw.txt");
		
		FileWriter fw=new FileWriter(file);
		PrintWriter pw=new PrintWriter(fw);
		
		pw.write(97);
		pw.write("\n");
		
		pw.println("Java");
		pw.println(100);
		pw.println('a');
		pw.println(50.5);
		pw.println(true);
		
		pw.close();
	}

}
