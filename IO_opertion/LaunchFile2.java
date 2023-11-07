package IO_opertion;
import java.io.*;
public class LaunchFile2 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		//File dir=new File("PWJAVA");
		//System.out.println(dir.isDirectory());
		//dir.mkdir();
		//System.out.println("dir is refering to directory PWJAVA :"+dir.isDirectory());
		
		//File file=new File(dir,"pwskll.txt");
		//file.createNewFile();
		//System.out.println("file is refering to pwskill.txt :"+file.isFile());
		
		int count = 0;
		File f=new File("H:\\ProKing");
		String str[]=f.list();
		
		for(String name:str)
		{
			count++;
			System.out.println(name);
		}
		System.out.println("No. of Fles are:"+count);
	}

}
