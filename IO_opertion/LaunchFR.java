package IO_opertion;
import java.io.*;
public class LaunchFR {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File dir=new File("D:\\RajuKushwahEnterprise\\PW");
		File file=new File(dir,"pw.txt");
		
		FileReader fd=new FileReader(file);
		
		char ch[]=new char[(int)file.length()];
		
		//int i=fd.read();
		fd.read(ch);
		
		for(char data:ch)
		{
			System.out.print(data);
		}
	
		//System.out.println((char)i);
		
		//while(i!=-1)
		//{
		//	System.out.print((i)+"---->");
		//	System.out.println((char)i);
		//	i=fd.read();
		//}
	}

}
